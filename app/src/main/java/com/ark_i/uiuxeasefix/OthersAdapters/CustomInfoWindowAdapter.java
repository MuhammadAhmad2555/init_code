package com.ark_i.uiuxeasefix.OthersAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ark_i.uiuxeasefix.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private final View mWindow;
    private final Context mContext;

    public CustomInfoWindowAdapter(Context context) {
        mContext = context;
        mWindow = LayoutInflater.from(context).inflate(R.layout.custom_info_window, null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        // No special treatment for the default info window
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        TextView info_title = mWindow.findViewById(R.id.info_title);
        TextView Numberofmen = mWindow.findViewById(R.id.numberofmen);
        TextView Numberofbags = mWindow.findViewById(R.id.numberofbags);
        TextView Numberofmoeny = mWindow.findViewById(R.id.numberofmoeny);
        TextView discription = mWindow.findViewById(R.id.info);

        LatLng position = marker.getPosition();

        Toast.makeText(mContext, ""+position, Toast.LENGTH_SHORT).show();


        if (position.equals(new LatLng(32.16774, 74.372))) {
            info_title.setText("New York");
            Numberofmen.setText("50");
            Numberofbags.setText("100");
            discription.setText("Departs 21 june | 09:30 AM");
            Numberofmoeny.setText("$5000");
        }
        if (position.equals(new LatLng(31.966000, 74.371800))) {
            info_title.setText("Paris");
            Numberofmen.setText("30");
            Numberofbags.setText("60");
            discription.setText("Departs 11 june | 11:30 AM");
            Numberofmoeny.setText("$3000");
        }
        if(position.equals(new LatLng(31.466125447680547, 74.37174804329312))) {

            info_title.setText("Lahore");
            Numberofmen.setText("32");
            Numberofbags.setText("12");
            discription.setText("Departs 10 july | 10:30 AM");
            Numberofmoeny.setText("$1000");
        }

        return mWindow;

    }
}
