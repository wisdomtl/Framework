package com.taylor.ad_imp_popad

import android.content.Context
import android.util.Log
import com.taylor.ad_api.AdInit

internal class PopAdInit : AdInit {
    override fun init(context: Context, appId: String) {
        Log.d("ttaylor", "PopAdInit.init: ")
    }
}