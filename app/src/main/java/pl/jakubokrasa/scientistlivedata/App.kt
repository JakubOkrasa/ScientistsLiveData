package pl.jakubokrasa.scientistlivedata

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import pl.jakubokrasa.scientistlivedata.di.koinInjector

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    private fun startKoin() {
        startKoin {
            androidContext(this@App)
            modules(koinInjector)
        }
    }
}