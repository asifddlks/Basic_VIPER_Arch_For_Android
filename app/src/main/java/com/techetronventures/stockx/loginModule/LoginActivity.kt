package com.techetronventures.stockx.loginModule

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.techetronventures.stockx.databinding.ActivityLoginBinding
import com.techetronventures.stockx.loginModule.validator.LoginValidationResponse
import timber.log.Timber

class LoginActivity : AppCompatActivity(), LoginContractor.LoginView {

    private val loginPresenter: LoginPresenter = LoginPresenter(this, this)
    private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            loginPresenter.loginButtonClicked()
        }

    }


    override fun getUserName(): String {
        return binding.edUserName.text.toString()
    }

    override fun getPassword(): String {
        return binding.edPin.text.toString()
    }

    override fun showUserNameError(validatorResponse: LoginValidationResponse) {
        Timber.d("error -> " + validatorResponse.error)
    }

    override fun showPasswordError(validatorResponse: LoginValidationResponse) {
        Timber.d("error -> " + validatorResponse.error)
    }

    override fun showUserValid() {
        Timber.d("login success")
    }

    override fun showUserInvalid() {
        Timber.d("login failed")
    }

}