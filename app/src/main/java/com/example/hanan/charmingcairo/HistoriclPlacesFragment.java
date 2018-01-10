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
public class HistoriclPlacesFragment extends Fragment {


    public HistoriclPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.drawable.historic_citadel_of_salah_ed_din,R.string.citadel_of_salah_ed_din_title,R.string.citadel_of_salah_ed_din_description
              ,R.string.citadel_of_salah_ed_din_contact  ,R.string.citadel_of_salah_ed_din_work_hours));
        places.add(new Place(R.drawable.historic_mosque_of_muhammad_ali,R.string.Mosque_of_Muhammad_Ali_title,R.string.Mosque_of_Muhammad_Ali_description
                ,R.string.citadel_of_salah_ed_din_contact  ,R.string.citadel_of_salah_ed_din_work_hours));
        places.add(new Place(R.drawable.historic_muhammad_ali_palace,R.string.muhammad_ali_palace_title,R.string.muhammad_ali_palace_description
                ,R.string.muhammad_ali_palace_contact  ,R.string.muhammad_ali_palace_work_hours));
        places.add(new Place(R.drawable.historic_baron_palace,R.string.The_palace_of_Baron_title,R.string.The_palace_of_Baron_description
                ,R.string.The_palace_of_Baron_contact  ,R.string.The_palace_of_Baron_work_hours));
        places.add(new Place(R.drawable.historic_khan_el_khalili,R.string.Khan_El_Khalili_title,R.string.Khan_El_Khalili_description
               ,R.string.Khan_El_Khalili_work_hours));
        places.add(new Place(R.drawable.historic_cairo_tower,R.string.Cairo_tower_title,R.string.Cairo_tower_description
               ,R.string.Cairo_tower_contact ,R.string.Cairo_tower_work_hours));
        places.add(new Place(R.drawable.historic_mosque_of_ibn_tulun,R.string.Ibn_Tulun_Mosque_title,R.string.Ibn_Tulun_Mosque_description
                ,R.string.Ibn_Tulun_Mosque_work_hours ));
        places.add(new Place(R.drawable.historic_sultan_hassan_mosque_school,R.string.sultan_Hassan_Mosque_title,R.string.sultan_Hassan_Mosque_description
                ,R.string.sultan_Hassan_Mosque_work_hours));

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
