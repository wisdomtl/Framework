package com.taylor.ad_imp_popad

import android.util.Log
import com.taylor.ad_imp_adsource.AdNetwork

internal class AdConfigLoader {

    fun load(slotId:String):List<AdNetwork>{
        Log.d("ttaylor", "AdConfigLoader.load: ")
        return listOf(AdNetwork.BAIDU,AdNetwork.TENCENT)
    }
}