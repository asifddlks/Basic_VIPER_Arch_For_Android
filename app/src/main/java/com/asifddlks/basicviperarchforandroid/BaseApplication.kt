package com.asifddlks.basicviperarchforandroid

import android.app.Application
import timber.log.Timber

class BaseApplication: Application() {


    override fun onCreate() {
        super.onCreate()

        //Timber

        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())

        }
    }
}