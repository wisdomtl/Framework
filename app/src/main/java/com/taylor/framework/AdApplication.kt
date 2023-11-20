package com.taylor.framework

import android.app.Application
import com.taylor.ad_api.AdInit
import com.taylor.ad_api.ParamFactory
import com.taylor.ad_imp_popad.initAd
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class AdApplication : Application() {
    private val adInit: AdInit by inject()

    /**
     * case: inject instance with Injected Parameters constructor
     */
    private val paramFactory by lazy { get<ParamFactory> { parametersOf("dddd") } }

    override fun onCreate() {
        super.onCreate()
        initAd()
        adInit.init(this, APP_ID)
        paramFactory.dodo()
    }
}