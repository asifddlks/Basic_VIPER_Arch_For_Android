package com.asifddlks.basicviperarchforandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asifddlks.basicviperarchforandroid.loginModule.LoginActivity

class MainActivity : AppCompatActivity() {

    //test commit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)



    }
}