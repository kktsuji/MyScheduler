package com.example.kouki.myscheduler

import android.app.Application
import io.realm.Realm

class MyScheduleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}