package com.taylor.ad_api

import android.util.Log

/**
 * case: inject instance with Injected Parameters constructor
 */
class ParamFactory(private val id:String) {

    fun dodo(){
        Log.d("ttaylor", "ParamFactory.dodo: id=${id} ")
    }
}