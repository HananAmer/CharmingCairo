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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.drawable.hotel_4seasons_nile_plaza,R.string.Four_Seasons_Hotel_title,R.string.Four_Seasons_Hotel_description
              ,R.string.Four_Seasons_Hotel_contact  ,R.string.Hotel_work_hours));
        places.add(new Place(R.drawable.hotel_nile_ritz_carlton,R.string.Nile_Ritz_Carlton_Hotel_title,R.string.Nile_Ritz_Carlton_Hotel_description
                ,R.string.Nile_Ritz_Carlton_Hotel_contact  ,R.string.Hotel_work_hours));
        places.add(new Place(R.drawable.hotel_j_w_marriott,R.string.JW_Marriott_Hotel_Cairo_title,R.string.JW_Marriott_Hotel_Cairo_description
                ,R.string.JW_Marriott_Hotel_Cairo_contact  ,R.string.Hotel_work_hours));
        places.add(new Place(R.drawable.hotel_dusit_thani_lake_view,R.string.Dusit_Thani_LakeView_title,R.string.Dusit_Thani_LakeView_description
                ,R.string.Dusit_Thani_LakeView_contact  ,R.string.Hotel_work_hours));
        places.add(new Place(R.drawable.hotel_sofitel_cairo,R.string.Sofitel_Cairo_title,R.string.Sofitel_Cairo_description
                ,R.string.Sofitel_Cairo_contact ,R.string.Hotel_work_hours));
        places.add(new Place(R.drawable.hotel_fairmont_nile_city,R.string.Fairmont_Nile_City_title,R.string.Fairmont_Nile_City_description
                ,R.string.Fairmont_Nile_City_contact ,R.string.Hotel_work_hours));
        places.add(new Place(R.drawable.hotel_kempinski,R.string.Kempinski_title,R.string.Kempinski_description
                ,R.string.Kempinski_contact ,R.string.Hotel_work_hours));
        places.add(new Place(R.drawable.hotel_mina_house,R.string.MENA_HOUSE_title,R.string.MENA_HOUSE_description
                ,R.string.MENA_HOUSE_contact ,R.string.Hotel_work_hours));
        places.add(new Place(R.drawable.hotel_sheraton,R.string.Sheraton_title,R.string.Sheraton_description
                ,R.string.Sheraton_contact ,R.string.Hotel_work_hours));

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
