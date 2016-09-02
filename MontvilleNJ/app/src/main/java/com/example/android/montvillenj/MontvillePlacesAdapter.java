package com.example.android.montvillenj;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MontvillePlacesAdapter extends ArrayAdapter <MontvillePlaces> {

    private int montColorResourceId;
    public MontvillePlacesAdapter(Context context, ArrayList<MontvillePlaces> montPlaces, int colorResourceId) {
        super(context, 0, montPlaces);
        montColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        MontvillePlaces currentPlace = getItem(position);
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentPlace.getMontPlace());
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentPlace.getMontAddress());
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        phoneTextView.setText(currentPlace.getMontPhone());
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website_text_view);
        websiteTextView.setText(currentPlace.getMontWebsite());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getImageId());
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), montColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}

