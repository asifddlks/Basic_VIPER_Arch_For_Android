package com.techetronventures.stockx.loginModule

import android.content.Context
import android.content.Intent
import com.techetronventures.stockx.MainActivity
import timber.log.Timber

class LoginRouter(private val context: Context) : LoginContractor.LoginRouter{

    private val tag : String = LoginRouter::class.simpleName.toString()

    override fun routeToMainActivity() {
        Timber.d("from presenter")
        context.startActivity(Intent(context, MainActivity::class.java))
    }


}