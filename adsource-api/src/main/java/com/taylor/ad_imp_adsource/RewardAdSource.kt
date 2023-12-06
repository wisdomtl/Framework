package com.taylor.ad_imp_adsource

import android.app.Activity

interface RewardAdSource:AdSource {
    fun show(activity: Activity)
}