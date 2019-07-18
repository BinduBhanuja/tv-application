package com.fordlabs.models;

import com.google.gson.annotations.SerializedName;

public class Network {

    private Country country;

    private class Country {

        @SerializedName("name")
        private String countryName;

        @SerializedName("code")
        private String code;
    }
}
