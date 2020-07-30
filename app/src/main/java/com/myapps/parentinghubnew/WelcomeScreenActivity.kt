package com.myapps.parentinghubnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome_screen.*

class WelcomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        btn_masuk.setOnClickListener {
            val intent = Intent(this, LoginScreenActivity::class.java)
            startActivity(intent)
        }

        tv_title5.setOnClickListener {
            val intentRegister = Intent(this, RegisterScreenActivity::class.java)
            startActivity(intentRegister)
        }
    }
}