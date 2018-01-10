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
public class PharaonicPlacesFragment extends Fragment {


    public PharaonicPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.drawable.pharao_giza_pyramids,R.string.pyramids_title,R.string.pyramids_description
               ,R.string.pyramids_site_work_hours));

        places.add(new Place(R.drawable.pharao_sphinx,R.string.Sphinx_title,R.string.Sphinx_description
                ,R.string.Sphinx_work_hours));

        places.add(new Place(R.drawable.pharao_solar_boat_museum,R.string.Solar_Boat_title,R.string.Solar_Boat_description
                ,R.string.solar_boats_museum_work_hours));

        places.add(new Place(R.drawable.pharao_sound_light_show,R.string.s_l_shows_title,R.string.s_l_shows_description,
                R.string.s_l_shows_contact,R.string.s_l_shows_work_hours));
        places.add(new Place(R.drawable.pharao_zoser_pyramid,R.string.Pyramid_of_Djoser_title,R.string.Pyramid_of_Djoser_description,
               R.string.Pyramid_of_Djoser_work_hours));
        places.add(new Place(R.drawable.pharaonic_village,R.string.Pharaonic_village_title,R.string.Pharaonic_village_description,
                R.string.Pharaonic_village_contact,R.string.Pharaonic_village_work_hours));
        places.add(new Place(R.drawable.pharao_inside_egyptian_museum,R.string.Egyptian_Museum_title,R.string.Egyptian_Museum_description,
                R.string.Egyptian_Museum_contact,R.string.Egyptian_Museum_work_hours));
        places.add(new Place(R.drawable.pharao_papyrus_egypt_museum,R.string.Papyrus_Egypt_Museum_title,R.string.Papyrus_Egypt_Museum_description,
                R.string.Papyrus_Egypt_Museum_contact,R.string.Papyrus_Egypt_Museum_work_hours));
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
