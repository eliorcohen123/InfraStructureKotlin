package elior.com.infrastructurekotlin.OtherPackage

import android.app.Application
import elior.com.infrastructurekotlin.RetrofitPackage.GetDataService
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {

    private val listOfModules = module {
        single { GetDataService() }
    }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(listOfModules)
        }

        mApplication = this;
    }

    companion object {
        private var mApplication: Application? = null
        fun getApplication(): Application? {
            return mApplication
        }
    }
}

private operator fun GetDataService.Companion.invoke(): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}