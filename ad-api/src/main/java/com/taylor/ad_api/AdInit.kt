package com.taylor.ad_api

import android.content.Context

interface AdInit {
    fun init(context: Context, appId: String)
}