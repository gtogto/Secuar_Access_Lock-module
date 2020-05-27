package com.example.android.bluetoothchat;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WasService {
//    @GET("/api/mobileTest?deviceNo={deviceNo}")
//    Call<JsonObject> getWasData(@Query("deviceNo") String deviceNo);
    @GET("/api/mobileTest")
    Call<JsonObject> getWasData(@Query("deviceNo") int deviceNo, @Query("st") int st);
}