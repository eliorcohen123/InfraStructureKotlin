package elior.com.infrastructurekotlin.RetrofitPackage

import elior.com.infrastructurekotlin.DataPackage.JSONResponse
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface GetDataService {

    @GET("/3/search/movie?/&query=q&api_key=4e0be2c22f7268edffde97481d49064a")
    fun getAllMovies(): Observable<JSONResponse>

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
