package com.example.hanan.charmingcairo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NationalParkFragment extends Fragment {


    public NationalParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.drawable.park_international,R.string.International_Park_title,R.string.International_Park_description
              ,R.string.International_Park_contact  ,R.string.International_Park_work_hours));
        places.add(new Place(R.drawable.park_alhorreya,R.string.Al_Horreya_Garden_title,R.string.Al_Horreya_Garden_description
                  ,R.string.Al_Horreya_Garden_work_hours));
        places.add(new Place(R.drawable.park_acquarium_grotto,R.string.Aquarium_Grotto_Garden_title,R.string.Aquarium_Grotto_Garden_description
              ,R.string.Aquarium_Grotto_Garden_contact  ,R.string.Aquarium_Grotto_Garden_work_hours));
        places.add(new Place(R.drawable.park_alandalus,R.string.Al_Andalus_Garden_title,R.string.Al_Andalus_Garden_description
                ,R.string.Al_Andalus_Garden_contact ,R.string.Al_Andalus_Garden_work_hours));
        places.add(new Place(R.drawable.park_japanese,R.string.Japanese_Garden_title,R.string.Japanese_Garden_description
                ,R.string.Japanese_Garden_contact ,R.string.Japanese_Garden_work_hours));
        places.add(new Place(R.drawable.park_orman,R.string.Orman_Garden_title,R.string.Orman_Garden_description
                ,R.string.Orman_Garden_contact ,R.string.Orman_Garden_work_hours));
        places.add(new Place(R.drawable.park_family,R.string.Family_Park_title,R.string.Family_Park_description
                ,R.string.Family_Park_contact ,R.string.Family_Park_work_hours));
        places.add(new Place(R.drawable.park_al_azhar,R.string.Al_Azhar_Park_title,R.string.Al_Azhar_Park_description
                ,R.string.Al_Azhar_Park_contact ,R.string.Al_Azhar_Park_work_hours));
        places.add(new Place(R.drawable.park_safari,R.string.Safari_Park_title,R.string.Safari_Park_description
                ,R.string.Safari_Park_work_hours ));

// Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        //category_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
