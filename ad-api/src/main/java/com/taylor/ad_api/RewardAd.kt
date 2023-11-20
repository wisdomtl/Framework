package com.taylor.ad_api

import android.app.Activity

abstract class RewardAd(slotId:String): Ad(slotId) {
    abstract fun show(activity: Activity)
}