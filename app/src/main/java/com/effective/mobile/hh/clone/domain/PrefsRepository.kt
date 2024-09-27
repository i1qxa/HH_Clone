package com.effective.mobile.hh.clone.domain

interface PrefsRepository {

    fun isUserAuthorise(): Boolean

    fun authoriseUser(): Boolean

}