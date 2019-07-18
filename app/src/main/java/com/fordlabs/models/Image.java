package com.fordlabs.models;

import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("medium")
    private String mediumImage;

    @SerializedName("original")
    private String originalImage;
}
