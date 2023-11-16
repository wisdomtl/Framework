package com.taylor.ad_api

import android.view.ViewGroup
import com.taylor.ad.Ad

abstract class SplashAd(slotId: String) : Ad(slotId) {
    abstract fun show(viewGroup: ViewGroup)
}