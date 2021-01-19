package com.example.android.miwok;

import android.media.Image;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImage = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudio;


    public Word(String defaultTranslation, String miwokTranslation, int audio){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = audio;
    }

    public Word(String defaultTranslation, String miwokTranslation,int image, int audio){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = image;
        mAudio = audio;
    }


    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImage(){
        return mImage;
    }

    public boolean hasImage(){
        return mImage != NO_IMAGE_PROVIDED;
    }

    public int getmAudio(){
        return mAudio;
    }
}
