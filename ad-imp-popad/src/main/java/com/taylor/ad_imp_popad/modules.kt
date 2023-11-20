package com.taylor.ad_imp_popad

import com.taylor.ad_api.AdFactory
import com.taylor.ad_api.AdInit
import org.koin.dsl.module

val adModules = module {
    single<AdFactory> { PopAdFactory }
    single<AdInit> { PopAdInit() }
}