package com.taylor.ad_imp_topad

import com.taylor.ad_api.Ad
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.named
import org.koin.dsl.module
import org.koin.dsl.bind

val adModules = module {
    factoryOf(::TopAd) { named("topad") } bind Ad::class

}