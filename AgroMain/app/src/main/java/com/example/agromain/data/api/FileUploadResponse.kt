package com.example.agromain.data.api


import com.google.gson.annotations.SerializedName

data class FileUploadResponse(

    @field:SerializedName("scanData")
    val scanData: ScanData,

    @field:SerializedName("message")
    val message: String
)

data class ScanData(

    @field:SerializedName("note")
    val note: String,

    @field:SerializedName("createdAt")
    val createdAt: String,

    @field:SerializedName("imageUrl")
    val imageUrl: String,

    @field:SerializedName("id")
    val id: String,

    @field:SerializedName("status")
    val status: String
)
