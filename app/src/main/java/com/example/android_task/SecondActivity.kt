package com.example.android_task

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity :AppCompatActivity(){
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userName = intent.getStringExtra(USER_EMAIL)
        val userPassword = intent.getStringExtra(USER_PASSWORD)
        textView.text = "Email: $userName, Password: $userPassword"
        buttonBack.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}