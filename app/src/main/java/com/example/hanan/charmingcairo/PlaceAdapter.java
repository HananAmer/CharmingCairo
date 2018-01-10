package com.example.hanan.charmingcairo;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Place}s to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place current_place = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_title_text_view.
        TextView PlaceTitleTextView = (TextView) listItemView.findViewById(R.id.place_title_text_view);
        // Get the place title from the current_place object and set this text on
        // the title TextView.
        PlaceTitleTextView.setText(current_place.getmPlaceTitle());

        // Find the TextView in the list_item.xml layout with the ID description_text_view.
        TextView DescriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the place description from the current_place object and set this text on
        // the description TextView.
        DescriptionTextView.setText(current_place.getmPlaceDescription());


        // Find the TextView in the list_item.xml layout with the ID contact_number.
        TextView contactTextView = (TextView) listItemView.findViewById(R.id.contact_number);
        // Check if a contact is provided for this place or not
        if (current_place.hasContact()) {
            // If a contact is available,
            // Get the place contact number from the current_place object and set this text on
            // the contact number TextView.
           contactTextView.setText(current_place.getmPlaceContact());
            // Make sure the view is visible
            contactTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            contactTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID work_hours.
        TextView WorkHoursTextView = (TextView) listItemView.findViewById(R.id.work_hours);
        // Get the place description from the current_place object and set this text on
        // the work hours TextView.
        WorkHoursTextView.setText(current_place.getmPlaceWorkHours());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the place Image resource id from the current_place object and set this image on
        // the image ImageView.
        imageView.setImageResource(current_place.getmImageResourceId());

        // Return the whole list item layout so that it can be shown in
        // the ListView.
        return listItemView;
    }
}