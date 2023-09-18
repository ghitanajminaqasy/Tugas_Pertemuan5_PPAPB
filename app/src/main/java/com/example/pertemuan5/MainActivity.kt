package com.example.pertemuan5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.activity.result.contract.ActivityResultContracts
import com.example.pertemuan5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var TAG = "MainActivityLifecycle"

    companion object{
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_MAIL = "extra_mail"
        const val EXTRA_PHONE = "extra_phone"
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnRegister.setOnClickListener{
                val intentToSecondActivity =
                    Intent(this@MainActivity,SecondActivity::class.java)
                val username = editUsername.text.toString()
                intentToSecondActivity.putExtra(EXTRA_USERNAME, username)
                val mail = editMail.text.toString()
                intentToSecondActivity.putExtra(EXTRA_MAIL, mail)
                val phone = editPhone.text.toString()
                intentToSecondActivity.putExtra(EXTRA_PHONE, phone)
                startActivity(intentToSecondActivity)
            }
        }
    }
}