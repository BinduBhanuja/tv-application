package com.fordlabs.models;

import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("average")
    private double average;

    public double getAverage() {
        return average;
    }
}
