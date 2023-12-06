package com.taylor.ad_imp_adsource

import android.app.Activity

interface InterstitialAdSource:AdSource {
    fun show(activity: Activity)
}