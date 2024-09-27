package com.effective.mobile.hh.clone.data

import android.content.Context
import com.effective.mobile.hh.clone.domain.PrefsRepository

const val PREFS_NAME = "hh_clone_prefs"
const val IS_USER_AUTHORISE = "is_user_authorise"

class PrefsRepositoryImpl(private val context: Context) : PrefsRepository {

    private val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    override fun isUserAuthorise(): Boolean {
        return prefs.getBoolean(IS_USER_AUTHORISE, false)
    }

    override fun authoriseUser(): Boolean {
        prefs.edit().putBoolean(IS_USER_AUTHORISE, true).apply()
        return isUserAuthorise()
    }
}