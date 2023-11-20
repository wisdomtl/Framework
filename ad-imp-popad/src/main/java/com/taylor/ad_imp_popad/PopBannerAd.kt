package com.taylor.ad_imp_popad

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import com.taylor.ad_api.StateListener
import com.taylor.ad_api.BannerAd

internal class PopBannerAd(private val popAd: PopAd, slotId: String) : BannerAd(slotId) {
    override fun show(block: (View, ViewGroup.LayoutParams) -> Unit) {
        popAd.show { ad -> (ad as BannerAd).show(block) }
    }

    override var stateListener: StateListener? = null

    override fun load(activity: Activity) {
        popAd.load(activity)
    }

    override fun release() {
        popAd.release()
    }
}