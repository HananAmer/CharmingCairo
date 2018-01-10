package com.example.hanan.charmingcairo;

/**
 * {@link Place} represents all informations about certain place.
 * It contains resource IDs for the place's title, description, contact number, work hours and
 * an image for it.
 */

public class Place {

    /** Image resource ID for the place */
    private int mImageResourceId;

    /** String resource ID for the title of the place */
    private int mPlaceTitle;

    /** String resource ID for the description of the place */
    private int mPlaceDescription;

    /** String resource ID for the contact number of the place */
    private int mPlaceContact=NO_CONTACT_PROVIDED;

    /** Constant value that represents no contact number was provided for this place */
    private static final int NO_CONTACT_PROVIDED = -1;

    /** String resource ID for the work hours of the place */
    private int mPlaceWorkHours;

    /**
     * Create a new Place object.
     *
     * @param Img_res_id is the drawable resource ID for the image associated with the place
     * @param title is the string resource Id for the title of the place
     * @param description is the string resource ID for the description of the place
     * @param contact is the string resource ID for the contact number of the place
     * @param work_hours is the string resource ID for the work hours of the place
     */
    public Place(int Img_res_id, int title, int description, int contact, int work_hours)
    {
        mImageResourceId =Img_res_id;
        mPlaceTitle = title;
        mPlaceContact = contact;
        mPlaceDescription = description;
        mPlaceWorkHours = work_hours;
    }
    /**
     * Another constructor for creating new Place object without the contact parameter
     **/
    public Place(int Img_res_id, int title, int description, int work_hours)
    {
        mImageResourceId =Img_res_id;
        mPlaceTitle = title;
        mPlaceDescription = description;
        mPlaceWorkHours = work_hours;
    }
    /**
     * Return the image resource ID for the image of the place
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return the string resource ID for the title of the place
     */
    public int getmPlaceTitle() {
        return mPlaceTitle;
    }

    /**
     * Return the string resource ID for the place's decription
     */
    public int getmPlaceDescription() {
        return mPlaceDescription;
    }

    /**
     * Return the string resource ID for the place's contact number
     */
    public int getmPlaceContact() {
        return mPlaceContact;
    }

    /**
     * Return the string resource ID for the work hours of the place
     */
    public int getmPlaceWorkHours() {
        return mPlaceWorkHours;
    }

    /**
     * Returns whether or not there is a contact number for this place.
     */
    public boolean hasContact() {
        return mPlaceContact != NO_CONTACT_PROVIDED;
    }
}
