package com.taylor.ad_imp_adsource

import android.view.ViewGroup

interface SplashAdSource:AdSource {
    abstract fun show(viewGroup: ViewGroup)
}