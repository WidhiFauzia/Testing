package com.myapps.parentinghubnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_screen.*
import kotlinx.android.synthetic.main.activity_login_screen.tv_title5

class LoginScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        iv_back.setOnClickListener {
            finish()
        }

        tv_title5.setOnClickListener {
            val intentRegister = Intent(this, RegisterScreenActivity::class.java)
            startActivity(intentRegister)
            finish()
        }
    }
}