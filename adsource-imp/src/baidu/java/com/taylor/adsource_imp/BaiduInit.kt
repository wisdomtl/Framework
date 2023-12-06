package com.taylor.adsource_imp

import android.content.Context
import android.util.Log
import com.taylor.ad_imp_adsource.NetworkInit

internal  class BaiduInit:NetworkInit {
    override fun init(context: Context, appId: String, initParam: String) {
        Log.d("ttaylor", "BaiduInit.init: ")
    }

    override val version: String
        get() = "1.0.2"
}