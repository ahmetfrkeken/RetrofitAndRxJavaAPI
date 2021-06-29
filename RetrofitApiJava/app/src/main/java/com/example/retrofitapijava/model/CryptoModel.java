package com.example.retrofitapijava.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    public String Currency;

    @SerializedName("Price")
    public String Price;

}
