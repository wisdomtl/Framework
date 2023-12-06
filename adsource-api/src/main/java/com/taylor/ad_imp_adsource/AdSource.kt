package com.taylor.ad_imp_adsource

import android.app.Activity
import android.view.ViewGroup

interface AdSource {
    val adNetwork: AdNetwork
    fun load(activity: Activity, param: String)
    fun release()
}

enum class AdNetwork {
    KS,
    BAIDU,
    TENCENT,
    PANGLE,
    UNKNOWN
}