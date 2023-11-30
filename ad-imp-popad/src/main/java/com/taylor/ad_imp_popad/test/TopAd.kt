package com.taylor.ad_imp_popad.test

import android.app.Activity
import android.util.Log
import com.taylor.ad_api.Ad
import com.taylor.ad_api.StateListener

internal class TopAd(slotId:String): Ad(slotId) {
    override var stateListener: StateListener? = null

    override fun load(activity: Activity) {
        Log.d("ttaylor", "TopAd.load: ")
    }

    override fun release() {
        Log.d("ttaylor", "TopAd.release: ")
    }
}