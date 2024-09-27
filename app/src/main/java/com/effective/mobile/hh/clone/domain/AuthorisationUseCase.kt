package com.effective.mobile.hh.clone.domain

import android.content.Context
import android.content.Intent
import com.effective.mobile.hh.clone.MainActivity

class AuthorisationUseCase(private val context: Context, private val prefsRepository: PrefsRepository) {

    fun launchMainApp(){
        if (prefsRepository.isUserAuthorise()){
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }

}