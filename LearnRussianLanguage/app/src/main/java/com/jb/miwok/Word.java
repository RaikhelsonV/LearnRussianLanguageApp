package com.jb.miwok;

public class Word {
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultTranslation;
    private String mRusTranslation;

    private int mAudioResourceId;

    public Word(String defaultTranslation, String rusTranslation, int ImageResourceId, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mRusTranslation = rusTranslation;
        this.mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String mDefaultTranslation, String mRusTranslation, int audioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mRusTranslation = mRusTranslation;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getRusTranslation() {
        return mRusTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}