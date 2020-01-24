package elior.com.infrastructurekotlin.ClassesPackage

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import elior.com.infrastructurekotlin.AdapterPackage.InfraListAdapter
import elior.com.infrastructurekotlin.DataPackage.MovieModel
import elior.com.infrastructurekotlin.R
import elior.com.infrastructurekotlin.RetrofitPackage.GetDataService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val client by lazy {
        GetDataService.create()
    }
    private var disposable: Disposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showData()
    }

    private fun showData() {
        disposable = client.getAllMovies()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { result -> initRecyclerView(result.results.toList()) },
                { error -> Log.e("ERROR", error.message + " ") })
    }

    private fun initRecyclerView(dataList: List<MovieModel>) {
        recyclerview.adapter = InfraListAdapter(this, dataList)
        recyclerview.layoutManager = LinearLayoutManager(this)
    }

}
