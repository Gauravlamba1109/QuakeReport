package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class QuakeAdapter extends ArrayAdapter<Quake> {

    public QuakeAdapter(Activity context, ArrayList<Quake> quakeinfo) {
        super(context,0, quakeinfo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView= convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

    Quake currentquakeinfo = getItem(position);
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeTextView.setText(currentquakeinfo.getMagnitude());


        TextView locationTextView1 = (TextView) listItemView.findViewById(R.id.location1);
        locationTextView1.setText(currentquakeinfo.getLocation(0)+" of ");

        TextView locationTextView2 = (TextView) listItemView.findViewById(R.id.location2);
        locationTextView2.setText(currentquakeinfo.getLocation(1));


        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time);
        timeTextView.setText(currentquakeinfo.getTime());

        return listItemView;
    }
}
