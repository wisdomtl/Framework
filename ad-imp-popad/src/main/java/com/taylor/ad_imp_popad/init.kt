package com.taylor.ad_imp_popad

import org.koin.core.context.loadKoinModules


fun initPopAd() {
    loadKoinModules(adModules)// case: multiple startKoin will crash, loadKoinModules is an alternative
}