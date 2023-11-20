package com.taylor.ad_imp_popad

import com.taylor.ad_api.Ad
import com.taylor.ad_api.AdFactory
import com.taylor.ad_api.AdInit
import com.taylor.ad_api.test.ParamFactory
import com.taylor.ad_imp_popad.test.MultipleDefinition
import com.taylor.ad_imp_popad.test.MultipleDefinition1
import com.taylor.ad_imp_popad.test.MultipleDefinition2
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.named
import org.koin.dsl.module
import com.taylor.ad_imp_popad.test.TopAd
import org.koin.core.qualifier.named
import org.koin.dsl.bind

val adModules = module {
    /**
     * case: create a singleton
     */
    single<AdFactory> { PopAdFactory }
    single<AdInit> { PopAdInit() } // singleOf(::PopAdInit) bind AdInit::class
    /**
     * case: create new instance every time by factoryOf and destroy the previous one
     */
    factoryOf(::ParamFactory)

    /**
     * case: create two definitions about the same type with parameter constructor
     */
    factoryOf(::PopAd) {
        named("popad")
    } bind Ad::class //    factory<Ad>(named("popad")) { (slotId: String) -> PopAd(slotId) }

    /**
     * case: create two definitions about the same type
     */
    factory<MultipleDefinition>(named("m1")) { MultipleDefinition1() }
    factory<MultipleDefinition>(named("m2")) { MultipleDefinition2() }
}