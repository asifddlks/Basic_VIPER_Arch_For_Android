package com.techetronventures.stockx.loginModule.validator

class LoginValidator {


    fun validateUserNamePassword(userName : String, pass : String) : LoginValidationResponse{

        if (userName.isNullOrEmpty()){
            return  LoginValidationResponse(false,"User name empty",0)
        }

        if (pass.isNullOrEmpty()){
            return  LoginValidationResponse(false,"password empty",1)
        }

        if(userName.length != 4){
            return LoginValidationResponse(isSuccess = false,error = "Invalid user name length",0)
        }
        if(pass.length != 4){
            return LoginValidationResponse(isSuccess = false,error = "Invalid user name length",0)
        }


        return  LoginValidationResponse(true, "",-1)


    }
}