package elior.com.infrastructurekotlin.ClassesPackage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import elior.com.infrastructurekotlin.AdapterPackage.InfraListAdapterFavorites
import elior.com.infrastructurekotlin.R
import elior.com.infrastructurekotlin.RoomPackage.InfraViewModel
import kotlinx.android.synthetic.main.activity_main.*

class FavoritesActivity : AppCompatActivity() {

    private lateinit var infraViewModel: InfraViewModel

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
        getData()
    }

    private fun initUI() {
        infraViewModel = ViewModelProvider(this).get(InfraViewModel::class.java)
    }

    private fun getData() {
        val adapter = InfraListAdapterFavorites(this)
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)
        infraViewModel = ViewModelProvider(this).get(InfraViewModel::class.java)
        infraViewModel.allWords.observe(this, Observer { infra ->
            infra?.let { adapter.setInfrasFavorites(it) }
        })
    }

}
