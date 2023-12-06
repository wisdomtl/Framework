package com.taylor.adsource_imp

import com.taylor.ad_imp_adsource.BannerAdSource
import com.taylor.ad_imp_adsource.NetworkInit
import com.taylor.ad_imp_adsource.SplashAdSource
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.named
import org.koin.dsl.bind
import org.koin.dsl.module

val tecentAdModules by lazy {
    module {
        factoryOf(::TecentBannerAd) {
            named("TECENT")
        } bind BannerAdSource::class

        factoryOf(::TecentSplashAd) {
            named("TECENT")
        } bind SplashAdSource::class

        factoryOf(::TecentInit) {
            named("TECENT")
        } bind NetworkInit::class
    }
}