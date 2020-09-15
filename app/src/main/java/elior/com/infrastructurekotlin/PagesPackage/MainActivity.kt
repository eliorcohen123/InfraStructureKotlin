package elior.com.infrastructurekotlin.PagesPackage

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import elior.com.infrastructurekotlin.CustomAdaptersPackage.CustomAdapterInfraList
import elior.com.infrastructurekotlin.ModelsPackage.Results
import elior.com.infrastructurekotlin.R
import elior.com.infrastructurekotlin.RetrofitPackage.GetDataService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var disposable: Disposable? = null
    private val client by lazy {
        GetDataService.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showData()
    }

    private fun showData() {
        disposable =
            client.getAllMovies("/3/search/movie?/&query=q&api_key=" + getString(R.string.api_key))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { result -> initRecyclerView(result.results.toList()) },
                    { error -> Log.e("ERROR", error.message + " ") })
    }

    private fun initRecyclerView(dataList: List<Results>) {
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = CustomAdapterInfraList(this, dataList)
    }

}
