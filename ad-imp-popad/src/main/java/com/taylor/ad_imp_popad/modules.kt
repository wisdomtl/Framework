package com.taylor.ad_imp_popad

import com.taylor.ad_api.AdFactory
import org.koin.dsl.module

val adModules = module {
    single<AdFactory> { PopAdFactory }
}