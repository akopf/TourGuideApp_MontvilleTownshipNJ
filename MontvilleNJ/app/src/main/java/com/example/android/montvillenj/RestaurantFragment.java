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
public class RestaurantFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.activity_restaurant,container,false);
            final ArrayList<MontvillePlaces> montPlaces = new ArrayList<MontvillePlaces>();
            montPlaces.add(new MontvillePlaces(R.string.rest_name1, R.string.rest_address1, R.string.rest_phone1, R.string.rest_website1, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name2, R.string.rest_address2, R.string.rest_phone2, R.string.rest_website2, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name3, R.string.rest_address3, R.string.rest_phone3, R.string.rest_website3, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name4, R.string.rest_address4, R.string.rest_phone4, R.string.rest_website4, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name5, R.string.rest_address5, R.string.rest_phone5, R.string.rest_website5, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name6, R.string.rest_address6, R.string.rest_phone6, R.string.rest_website6, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name7, R.string.rest_address7, R.string.rest_phone7, R.string.rest_website7, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name8, R.string.rest_address8, R.string.rest_phone8, R.string.rest_website8, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name9, R.string.rest_address9, R.string.rest_phone9, R.string.rest_website9, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name10, R.string.rest_address10, R.string.rest_phone10, R.string.rest_website10, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name11, R.string.rest_address11, R.string.rest_phone11, R.string.rest_website11, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name12, R.string.rest_address12, R.string.rest_phone12, R.string.rest_website12, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name13, R.string.rest_address13, R.string.rest_phone13, R.string.rest_website13, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name14, R.string.rest_address14, R.string.rest_phone14, R.string.rest_website14, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name15, R.string.rest_address15, R.string.rest_phone15, R.string.rest_website15, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name16, R.string.rest_address16, R.string.rest_phone16, R.string.rest_website16, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name17, R.string.rest_address17, R.string.rest_phone17, R.string.rest_website17, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name18, R.string.rest_address18, R.string.rest_phone18, R.string.rest_website18, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name19, R.string.rest_address19, R.string.rest_phone19, R.string.rest_website19, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name20, R.string.rest_address20, R.string.rest_phone20, R.string.rest_website20, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name21, R.string.rest_address21, R.string.rest_phone21, R.string.rest_website21, R.drawable.ic_restaurant));
            montPlaces.add(new MontvillePlaces(R.string.rest_name22, R.string.rest_address22, R.string.rest_phone22, R.string.rest_website22, R.drawable.ic_restaurant));
            MontvillePlacesAdapter adapter = new MontvillePlacesAdapter(getActivity(), montPlaces, R.color.category_restaurant);
            ListView listView = (ListView) rootView.findViewById(R.id.list);
            listView.setAdapter(adapter);
        return rootView;
        }
    public RestaurantFragment() {
    }
}
