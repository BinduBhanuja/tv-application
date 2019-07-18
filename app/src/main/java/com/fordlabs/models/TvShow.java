package com.fordlabs.models;

import com.google.gson.annotations.SerializedName;

public class TvShow {

    @SerializedName("name")
    private String name;

    @SerializedName("airdate")
    private String airdate;

    @SerializedName("airtime")
    private String airtime;

    @SerializedName("runtime")
    private String runtime;

    @SerializedName("show")
    private Show show;

    public String getName() {
        return name;
    }

    public String getAirdate() {
        return airdate;
    }

    public String getAirtime() {
        return airtime;
    }

    public String getRuntime() {
        return runtime;
    }
}
