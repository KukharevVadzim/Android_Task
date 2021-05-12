package com.example.android_task

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userName = intent.getStringExtra(USER_EMAIL)
        val userPassword = intent.getStringExtra(USER_PASSWORD)
        buttonBack.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val text: String = "Email: $userName" + "Password: $userPassword"
        val constraintFragment = ConstraintFragment()
        val linnerFragment = LinerFragment()
        val bundle = Bundle()
        bundle.putString("text", text)
        constraintFragment.arguments = bundle
        linnerFragment.arguments = bundle
        makeCurrentFragment(constraintFragment)
        toolbar.setOnNavigationItemSelectedListener{
            when (it.itemId) {
                R.id.menu -> makeCurrentFragment(constraintFragment)
                R.id.search -> makeCurrentFragment(linnerFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.wrapper, fragment)
            commit()
        }
    }
}