package com.taylor.ad_imp_popad

import android.util.Log
import com.taylor.ad_api.AdFactory


object PopAdFactory : AdFactory {
    override fun <T> get(cls: Class<out T>, slotId: String): T {
        Log.d("ttaylor", "PopAdFactory.get: ")
        return cls.getConstructor(PopAd::class.java, String::class.java).newInstance(PopAd(slotId), slotId)
    }
}