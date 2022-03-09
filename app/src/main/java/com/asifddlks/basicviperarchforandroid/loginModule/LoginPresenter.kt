package com.asifddlks.basicviperarchforandroid.loginModule

import android.content.Context
import com.asifddlks.basicviperarchforandroid.loginModule.validator.LoginValidator
import timber.log.Timber

class LoginPresenter(private val loginView: LoginContractor.LoginView,private val context: Context) : LoginContractor.LoginPresenter{

    private  val loginInteractor: LoginInteractor = LoginInteractor(this)
    private val loginRouter = LoginRouter(context)


    override fun returnFromModel() {
        Timber.d("return from model")

    }

    override fun loginButtonClicked() {
        val username = loginView.getUserName()
        val password = loginView.getPassword()

        val validatorResponse = LoginValidator().validateUserNamePassword(username,password)

        if (validatorResponse.isSuccess){
            loginInteractor.checkLoginFromServer(username,password)
        }else{
            when(validatorResponse.index){
                0 -> loginView.showUserNameError(validatorResponse)
                1 -> loginView.showPasswordError(validatorResponse)

            }


        }

    }

    override fun loginSuccess() {
        loginView.showUserValid()
    }

    override fun loginFailed() {
        loginView.showUserInvalid()
    }


}