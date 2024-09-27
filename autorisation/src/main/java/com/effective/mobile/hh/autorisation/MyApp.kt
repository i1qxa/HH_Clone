package com.effective.mobile.hh.autorisation

import android.app.Application
import android.content.Intent
import com.effective.mobile.hh.clone.data.PrefsRepositoryImpl

class MyApp:Application() {

    override fun onCreate() {
        super.onCreate()
        val prefsRepository = PrefsRepositoryImpl(this)
        val intent = if (prefsRepository.isUserAuthorise()){
            Intent(this, MainActivity::class.java)
        }else{
            Intent(this, AuthorisationActivity::class.java)
        }
        startActivity(intent)
    }
}