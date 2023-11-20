package com.taylor.ad_imp_adsource

import android.content.Context

interface NetworkInit {
    fun init(context: Context, appId: String, initParam: String)
    val version: String
}