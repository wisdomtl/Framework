package com.taylor.adsource_imp

import android.app.Activity
import android.util.Log
import android.view.ViewGroup
import com.taylor.ad_imp_adsource.AdNetwork
import com.taylor.ad_imp_adsource.SplashAdSource

internal class BaiduSplashAd:SplashAdSource {
    override fun show(viewGroup: ViewGroup) {
        Log.d("ttaylor", "BaiduSplashAd.show: ")
    }

    override val adNetwork: AdNetwork
        get() = AdNetwork.BAIDU

    override fun load(activity: Activity, param: String) {
        Log.d("ttaylor", "BaiduSplashAd.load: ")
    }

    override fun release() {
        Log.d("ttaylor", "BaiduSplashAd.release: ")
    }
}