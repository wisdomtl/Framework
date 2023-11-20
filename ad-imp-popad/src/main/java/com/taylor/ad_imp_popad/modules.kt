package com.taylor.ad_imp_popad

import com.taylor.ad_api.AdFactory
import com.taylor.ad_api.AdInit
import com.taylor.ad_api.ParamFactory
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val adModules = module {
    single<AdFactory> { PopAdFactory }
    single<AdInit> { PopAdInit() } // singleOf(::PopAdInit) bind AdInit::class
    factoryOf(::ParamFactory)
}