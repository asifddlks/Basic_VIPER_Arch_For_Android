package com.techetronventures.stockx.loginModule.api


import com.techetronventures.stockx.loginModule.entity.PostsItem
import retrofit2.Call
import retrofit2.http.GET

interface LoginApi {

    @GET("posts")
    fun getPosts(): Call<List<PostsItem>>
}