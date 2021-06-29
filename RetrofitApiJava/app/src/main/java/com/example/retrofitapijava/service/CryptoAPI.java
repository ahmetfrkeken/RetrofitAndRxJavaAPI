package com.example.retrofitapijava.service;

import com.example.retrofitapijava.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //https://api.nomics.com/v1/prices?key=62aa6e12ffd0f046323b9a8e43a6aff022e0b53a

    @GET("prices?key=62aa6e12ffd0f046323b9a8e43a6aff022e0b53a")
    Call<List<CryptoModel>> getData();
}
