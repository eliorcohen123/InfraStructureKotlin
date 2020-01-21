package elior.com.infrastructurekotlin.ClassesPackage

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import elior.com.infrastructurekotlin.AdapterPackage.InfraListAdapter
import elior.com.infrastructurekotlin.R
import elior.com.infrastructurekotlin.RoomPackage.InfraViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var infraViewModel: InfraViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListeners()
        getData()
    }

    private fun initListeners() {
        fab.setOnClickListener(this)
    }

    private fun getData() {
        val adapter =
            InfraListAdapter(this)
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)

        infraViewModel = ViewModelProvider(this).get(InfraViewModel::class.java)
        infraViewModel.allWords.observe(this, Observer { infra ->
            infra?.let { adapter.setInfras(it) }
        })
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.fab -> {
                val intent = Intent(this@MainActivity, NewInfraActivity::class.java)
                startActivity(intent)
            }
        }
    }

}
