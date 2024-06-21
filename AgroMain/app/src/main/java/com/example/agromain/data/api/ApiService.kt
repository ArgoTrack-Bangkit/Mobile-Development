package com.example.agromain.data.api

import okhttp3.MultipartBody
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {
    @Multipart
    @POST("api/scan")
    suspend fun uploadImage(
        @Part file: MultipartBody.Part
    ): FileUploadResponse

    @FormUrlEncoded
    @POST("register")
    suspend fun register(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String,
        @Field("birthday") birthday: String,
        @Field("gender") gender: String
    ): RegisterResponse
}