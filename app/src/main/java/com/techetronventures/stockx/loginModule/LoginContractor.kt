package com.techetronventures.stockx.loginModule

import com.techetronventures.stockx.loginModule.validator.LoginValidationResponse

class LoginContractor {

    //abstract methods for view
    interface  LoginView{
        fun getUserName(): String
        fun getPassword(): String
        fun showUserNameError(validatorResponse: LoginValidationResponse)
        fun showPasswordError(validatorResponse: LoginValidationResponse)
        fun showUserValid()
        fun showUserInvalid()
    }

    //abstract methods for model
    interface  LoginInteractor{
        fun checkLoginFromServer(username: String, password: String)
    }

    //abstract methods for presenter
    interface  LoginPresenter{
        fun returnFromModel()
        fun loginButtonClicked()
        fun loginSuccess()
        fun loginFailed()
    }

    interface LoginRouter{
        fun routeToMainActivity()
    }
}