package com.example.android.miwok;

import android.media.Image;
import android.widget.ImageView;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok Translation for that word.
 */
public class Word {


    /**Miwok translation for the word.*/
    private String mMiwokTranslation;

    /**Default translation for the word.*/
    private String mDefaultTranslation;

    /*Image resource ID.*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /*Pronunciation sound resource ID.*/
    private int mSoundResourceId;

    /**Define the first constructor.
     * @param miwokTranslation
     * @param defaultTranslation
     */
    public Word(String miwokTranslation, String defaultTranslation, int SoundResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mSoundResourceId = SoundResourceId;
    }

    /**Define the second constructor that create a Word with image.
     * @param miwokTranslation
     * @param defaultTranslation
     * @param imageResourceId
     * */
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int soundResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }


    /**Public methods to get the translation for each resource.*/
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() { return mImageResourceId;}

    public int getSoundResourceId() { return mSoundResourceId; }

    /*Check if there is a image resource ID.

    */
    public boolean hasImageResource() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }
}
