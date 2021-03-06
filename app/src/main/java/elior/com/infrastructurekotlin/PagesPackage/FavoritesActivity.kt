package elior.com.infrastructurekotlin.PagesPackage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import elior.com.infrastructurekotlin.CustomAdaptersPackage.CustomAdapterInfraListFavorites
import elior.com.infrastructurekotlin.R
import elior.com.infrastructurekotlin.RoomPackage.InfraViewModel
import kotlinx.android.synthetic.main.activity_main.*

class FavoritesActivity : AppCompatActivity() {

    private lateinit var infraViewModel: InfraViewModel

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()
    }

    private fun getData() {
        infraViewModel = ViewModelProvider(this).get(InfraViewModel::class.java)
        infraViewModel.allInfras.observe(this, Observer { infra ->
            infra?.let {
                val adapter = CustomAdapterInfraListFavorites(it)
                recyclerview.layoutManager = LinearLayoutManager(this)
                recyclerview.adapter = adapter
            }
        })
    }

}
