package com.effective.mobile.hh.autorisation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.effective.mobile.hh.autorisation.databinding.ActivityAutorisationBinding
import com.effective.mobile.hh.clone.data.PrefsRepositoryImpl
import com.effective.mobile.hh.clone.domain.AuthorisationUseCase

class AuthorisationActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAutorisationBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.tvTest.setOnClickListener {
            val authorisation = AuthorisationUseCase(this, PrefsRepositoryImpl(this))
            authorisation.launchMainApp()
        }
    }
}