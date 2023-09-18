package com.example.pertemuan5

import android.app.Activity
import android.content.Intent
import android.content.Intent.EXTRA_PHONE_NUMBER
import android.content.Intent.EXTRA_USER
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.pertemuan5.MainActivity.Companion.EXTRA_MAIL
import com.example.pertemuan5.MainActivity.Companion.EXTRA_PHONE
import com.example.pertemuan5.MainActivity.Companion.EXTRA_USERNAME
import com.example.pertemuan5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val username = intent.getStringExtra(EXTRA_USERNAME)
        val email = intent.getStringExtra(EXTRA_MAIL)
        val phone = intent.getStringExtra(EXTRA_PHONE)
        with(binding) {
            txt1.text = "Hello $username"
            txt2.text = "Your $email has been actived"
            txt3.text = "Your $phone has been registered"
            btnLogout.setOnClickListener {
                finish()
                        }
                    }
                }
}

