package com.example.android.musicapp;

public class Song {
    private String mUpperTextView;
    private String mLowerTextView;

    //Song constructor that accepts 2 inputs
    public Song(String upperTextView, String lowerTextView) {
        mUpperTextView = upperTextView;
        mLowerTextView = lowerTextView;
    }

    public String getLowerTextView() {
        return mLowerTextView;
    }

    public String getUpperTextView() {
        return mUpperTextView;
    }
}
