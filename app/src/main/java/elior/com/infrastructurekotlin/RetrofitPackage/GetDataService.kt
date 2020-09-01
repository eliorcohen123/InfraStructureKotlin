package elior.com.infrastructurekotlin.RetrofitPackage

import elior.com.infrastructurekotlin.ModelsPackage.MovieModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

interface GetDataService {

    @GET
    fun getAllMovies(@Url url: String): Observable<MovieModel>

    companion object {
        fun create(): GetDataService {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("https://api.themoviedb.org")
                .build()

            return retrofit.create(GetDataService::class.java)
        }
    }

}
