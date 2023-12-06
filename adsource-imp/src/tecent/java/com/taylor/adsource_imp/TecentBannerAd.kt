package com.taylor.adsource_imp

import android.app.Activity
import android.util.Log
import android.view.View
import android.view.ViewGroup
import com.taylor.ad_imp_adsource.AdNetwork
import com.taylor.ad_imp_adsource.AdSource
import com.taylor.ad_imp_adsource.BannerAdSource

internal class TecentBannerAd : BannerAdSource {
    override fun show(block: (View, ViewGroup.LayoutParams) -> Unit) {
        Log.d("ttaylor", "TecentBannerAd.show: ")
    }

    override val adNetwork: AdNetwork
        get() = AdNetwork.TENCENT

    override fun load(activity: Activity, param: String) {
        Log.d("ttaylor", "TecentBannerAd.load: ")
    }

    override fun release() {
        Log.d("ttaylor", "TecentBannerAd.release: ")
    }
}