package com.asifddlks.basicviperarchforandroid.loginModule.api


import com.asifddlks.basicviperarchforandroid.loginModule.entity.PostsItem
import retrofit2.Call
import retrofit2.http.GET

interface LoginApi {

    @GET("posts")
    fun getPosts(): Call<List<PostsItem>>
}