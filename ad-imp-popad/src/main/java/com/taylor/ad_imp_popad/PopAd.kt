package com.taylor.ad_imp_popad

import android.app.Activity
import android.util.Log
import com.taylor.ad.Ad
import com.taylor.ad.StateListener
import com.taylor.ad_imp_popad.AdConfigLoader

class PopAd(slotId: String) : Ad(slotId) {
    override var stateListener: StateListener? = null
    private val loader by lazy { AdConfigLoader() }

    override fun load(activity: Activity) {
        Log.d("test", "PopAd.load: ")
        loader.load(slotId)
    }

    override fun release() {
        Log.d("test", "PopAd.release: ")
    }

    internal fun show(adNetworkShow: (Ad) -> Unit) {

    }
}