package com.taylor.ad_api

interface AdFactory {
    fun <T> get(cls: Class<out T>, slotId: String): T
}