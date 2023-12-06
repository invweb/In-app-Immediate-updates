package ru.zxTole.in_appupdates_immediate

import android.app.Application
import timber.log.Timber

class MyApplication  : Application() {
    fun logMessage(message: String) {
        Timber.d(message)
    }
}
