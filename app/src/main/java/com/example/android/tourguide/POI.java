package com.example.android.tourguide;

/**
 * Created by joshua on 4/27/17.
 */

public class POI {

    private int mName;
    private int mAddress;
    private int mDescription;

    private int mImageResourceId = No_Image_Provided;
    private static final int No_Image_Provided = -1;

    public POI(int nameStringID, int addressStringID, int descriptionStringID, int imageResourceID) {
        mName = nameStringID;
        mAddress = addressStringID;
        mDescription = descriptionStringID;
        mImageResourceId = imageResourceID;
    }

    public int getName() {
        return mName;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getImageID() {
        return mImageResourceId;
    }

    public int getDescription() { return mDescription; }

    public boolean hasImage() {
        return mImageResourceId != No_Image_Provided;
    }

}
