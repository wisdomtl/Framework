package com.taylor.adsource_imp

import android.app.Activity
import android.util.Log
import android.view.ViewGroup
import com.taylor.ad_imp_adsource.AdNetwork
import com.taylor.ad_imp_adsource.AdSource

class BaiduBannerAd:AdSource {
    override val adNetwork: AdNetwork
        get() = AdNetwork.BAIDU

    override fun load(activity: Activity, param: String) {
        Log.d("ttaylor", "BaiduBannerAd.load: ")
    }

    override fun show(viewGroup: ViewGroup) {
        Log.d("ttaylor", "BaiduBannerAd.show: ")
    }

    override fun release() {
        Log.d("ttaylor", "BaiduBannerAd.release: ")
    }
}