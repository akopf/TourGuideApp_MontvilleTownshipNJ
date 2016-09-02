package com.example.android.montvillenj;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.activity_park,container,false);
        final ArrayList<MontvillePlaces> montPlaces = new ArrayList<MontvillePlaces>();
        montPlaces.add(new MontvillePlaces(R.string.park_name1, R.string.park_address1, R.string.park_phone1, R.string.parks_website1, R.drawable.ic_park));
        montPlaces.add(new MontvillePlaces(R.string.park_name2, R.string.park_address2, R.string.park_phone2, R.string.parks_website2, R.drawable.ic_park));
        montPlaces.add(new MontvillePlaces(R.string.park_name3, R.string.park_address3, R.string.park_phone3, R.string.parks_website3, R.drawable.ic_park));
        montPlaces.add(new MontvillePlaces(R.string.park_name4, R.string.park_address3, R.string.park_phone4, R.string.parks_website4, R.drawable.ic_park));
        montPlaces.add(new MontvillePlaces(R.string.park_name5, R.string.park_address3, R.string.park_phone5, R.string.parks_website5, R.drawable.ic_park));
        montPlaces.add(new MontvillePlaces(R.string.park_name6, R.string.park_address3, R.string.park_phone6, R.string.parks_website6, R.drawable.ic_park));
        montPlaces.add(new MontvillePlaces(R.string.park_name7, R.string.park_address3, R.string.park_phone7, R.string.parks_website7, R.drawable.ic_park));
        MontvillePlacesAdapter adapter = new MontvillePlacesAdapter(getActivity(), montPlaces, R.color.category_park);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
    public ParkFragment() {
    }
}
