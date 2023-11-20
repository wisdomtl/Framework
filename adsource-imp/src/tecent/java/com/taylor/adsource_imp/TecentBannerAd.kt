package com.taylor.adsource_imp

import android.app.Activity
import android.util.Log
import android.view.ViewGroup
import com.taylor.ad_imp_adsource.AdNetwork
import com.taylor.ad_imp_adsource.AdSource

class TecentBannerAd : AdSource {
    override val adNetwork: AdNetwork
        get() = AdNetwork.TENCENT

    override fun load(activity: Activity, param: String) {
        Log.d("ttaylor", "TecentBannerAd.load: ")
    }

    override fun show(viewGroup: ViewGroup) {
        Log.d("ttaylor", "TecentBannerAd.show: ")
    }

    override fun release() {
        Log.d("ttaylor", "TecentBannerAd.release: ")
    }
}