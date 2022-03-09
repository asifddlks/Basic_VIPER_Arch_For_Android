package com.asifddlks.basicviperarchforandroid.loginModule

import android.util.Log
import com.asifddlks.basicviperarchforandroid.RetrofitClient
import com.asifddlks.basicviperarchforandroid.loginModule.api.LoginApi
import com.asifddlks.basicviperarchforandroid.loginModule.entity.PostsItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginInteractor(private  val loginPresenter: LoginContractor.LoginPresenter) : LoginContractor.LoginInteractor {


    override fun checkLoginFromServer(username: String, password: String) {


        val retrofitBuilder  = RetrofitClient.getClient().create(LoginApi::class.java)
        val retrofitData = retrofitBuilder.getPosts()


        retrofitData.enqueue( object : Callback<List<PostsItem>>{
            override fun onResponse(call: Call<List<PostsItem>>?, response: Response<List<PostsItem>>?) {
                Log.d("aa","success ")
                if (response?.body() != null) {
                    Log.d("aa","response "+response.body().toString())
                }
            }

            override fun onFailure(call: Call<List<PostsItem>>?, t: Throwable?) {
                Log.d("aa","failed ")
            }
        })

//        if (username == "abcd" && password == "1234"){
//            loginPresenter.loginSuccess()
//        }else{
//            loginPresenter.loginFailed()
//        }
    }

}