package com.asifddlks.basicviperarchforandroid.loginModule

import android.content.Context
import android.content.Intent
import com.asifddlks.basicviperarchforandroid.MainActivity
import timber.log.Timber

class LoginRouter(private val context: Context) : LoginContractor.LoginRouter{

    private val tag : String = LoginRouter::class.simpleName.toString()

    override fun routeToMainActivity() {
        Timber.d("from presenter")
        context.startActivity(Intent(context, MainActivity::class.java))
    }


}