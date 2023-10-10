package com.example.listviewandadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewandadapter.R;
import com.example.listviewandadapter.model.PlanetModel;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<PlanetModel> {

    // Array list is part of java and object is planetmodel
    ArrayList<PlanetModel> planetModelArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<PlanetModel> planetModelArrayList, Context context) {
        super(context, R.layout.item_list_layout, planetModelArrayList);
        this.planetModelArrayList = planetModelArrayList;
    }


    private static class MyViewHolder {
        TextView planteName, moonCount;
        ImageView planetImage;
    }

    // getView(); used to create and return  view for a specific item
    // in the list

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);

        // get the planet object for the urrent position item
        PlanetModel planetModel = getItem(position);

        MyViewHolder myViewHolder;
        final View result;

        if (convertView == null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false
            );

            // Finding Views

            myViewHolder.planteName = (TextView) convertView.findViewById(R.id.planet_name);
            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.moon_count_text);
            myViewHolder.planetImage = (ImageView) convertView.findViewById(R.id.imageView);

            result = convertView;

            convertView.setTag(myViewHolder);
        } else {
            // the view is recycled
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        myViewHolder.planteName.setText(planetModel.getPlanetName());
        myViewHolder.moonCount.setText(planetModel.getMoonCount());
        myViewHolder.planetImage.setImageResource(planetModel.getPlanetImage());

        return convertView;
    }
}
