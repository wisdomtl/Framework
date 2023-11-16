package com.taylor.ad_api

import android.app.Activity
import com.taylor.ad.Ad

abstract class InterstitialAd(slotId: String) : Ad(slotId) {
    abstract fun show(activity: Activity)
}