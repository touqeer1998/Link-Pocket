package com.example.linkpocket

import android.app.Application
import android.util.Log
import com.google.android.gms.ads.MobileAds
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltAndroidApp
class LinkPocketApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("LinkPocketApp", "Application started")
        CoroutineScope(Dispatchers.IO).launch {
            MobileAds.initialize(applicationContext)
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d("LinkPocketApp", "Application terminated")
    }
}