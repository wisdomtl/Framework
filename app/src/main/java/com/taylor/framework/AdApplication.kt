package com.taylor.framework

import android.app.Application
import com.taylor.ad_api.AdInit
import com.taylor.ad_imp_popad.initAd
import org.koin.android.ext.android.inject
import org.koin.core.context.startKoin

class AdApplication : Application() {
    private val adInit: AdInit by inject()

    override fun onCreate() {
        super.onCreate()
        initAd()
        adInit.init(this, APP_ID)
    }
}