package com.example.ptm9.Network

import com.example.ptm9.Response.ApiResponse
import com.example.ptm9.Response.ResponseDataDeleteMahasiswa
import com.example.ptm9.Response.ResponseDataInsertMahasiswa
import com.example.ptm9.Response.ResponseDataUpdateMahasiswa
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("datamahasiswa/")
    fun remoteGetdatamahasiswa(): Call<ApiResponse>

    @FormUrlEncoded
    @POST("datamahasiswa/")
    fun insertMahasiswa(
        @Field("nim") nim: String,
        @Field("nama") nama: String,
        @Field("telepon") telepon: String
    ): Call<ResponseDataInsertMahasiswa>

    @DELETE("datamahasiswa/{nim}")
    fun deleteMahasiswa(@Path("nim") nim: String): Call<ResponseDataDeleteMahasiswa>

    @FormUrlEncoded
    @POST("datamahasiswa/{nim}")
    fun updateMahasiswa(
        @Path("nim") nim: String,
        @Field("nama") nama: String,
        @Field("telepon") telepon: String
    ): Call<ResponseDataUpdateMahasiswa>

}