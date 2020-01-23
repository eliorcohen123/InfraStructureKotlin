package elior.com.infrastructurekotlin.ClassesPackage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import elior.com.infrastructurekotlin.AdapterPackage.InfraListAdapter
import elior.com.infrastructurekotlin.DataPackage.MovieModel
import elior.com.infrastructurekotlin.R
import elior.com.infrastructurekotlin.RetrofitPackage.GetDataService
import kotlinx.android.synthetic.main.activity_main.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val client by lazy {
        GetDataService.create()
    }

    private var disposable: Disposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListeners()
        showArticles()
    }

    private fun initListeners() {
        fab.setOnClickListener(this)
    }

    private fun showArticles() {
        disposable = client.getAllMovies()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { result -> getData(result.results.toList()) },
                { error -> Log.e("ERROR", error.message) }
            )
    }

    private fun getData(dataList: List<MovieModel>) {
        recyclerview.adapter = InfraListAdapter(this, dataList)
        recyclerview.layoutManager = LinearLayoutManager(this)
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
