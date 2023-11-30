package com.taylor.ad_imp_topad

import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin

fun initTopAd() {
    loadKoinModules(adModules)
}