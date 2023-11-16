package com.taylor.ad_imp_popad.gdt

import android.app.Activity
import android.util.Log
import android.view.ViewGroup
import com.taylor.ad_imp_adsource.AdNetwork
import com.taylor.ad_imp_adsource.AdSource

internal class TecentBannerAd : com.taylor.ad_imp_adsource.AdSource {
    override val adNetwork: com.taylor.ad_imp_adsource.AdNetwork
        get() = com.taylor.ad_imp_adsource.AdNetwork.TENCENT

    override fun load(activity: Activity, param: String) {
        Log.d("ttaylor", "TecentBannerAD.load: ")
    }

    override fun show(viewGroup: ViewGroup) {
        Log.d("ttaylor", "TecentBannerAD.show: ")
    }

    override fun release() {
        Log.d("ttaylor", "TecentBannerAD.release: ")
    }
}