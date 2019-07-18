package com.fordlabs.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Show {

    @SerializedName("url")
    private String showUrl;

    @SerializedName("type")
    private String showType;

    @SerializedName("language")
    private String showLanguage;

    @SerializedName("genres")
    private List<String> genreList;

    @SerializedName("rating")
    private Rating rating;

    @SerializedName("network")
    private Network network;

    @SerializedName("image")
    private Image image;

    @SerializedName("summary")
    private String summary;
}
