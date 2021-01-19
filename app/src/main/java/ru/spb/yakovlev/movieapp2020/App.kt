package ru.spb.yakovlev.movieapp2020

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import ru.spb.yakovlev.movieapp2020.data.remote.NetworkMonitor
import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        initLogger()
    }

    private fun initLogger() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
    companion object {
        internal lateinit var INSTANCE: App
            private set
    }
}