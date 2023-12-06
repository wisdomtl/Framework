package com.taylor.ad_imp_adsource

import android.view.View
import android.view.ViewGroup

interface BannerAdSource:AdSource {
    fun show(block: (View, ViewGroup.LayoutParams) -> Unit)
}