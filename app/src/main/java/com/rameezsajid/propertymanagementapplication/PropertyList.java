package com.rameezsajid.propertymanagementapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PropertyList extends ArrayAdapter<Properties> {
    private Activity context;
    private List<Properties> propertyList;

    public PropertyList (Activity context, List<Properties> propertyList) {
        super(context, R.layout.list_layout, propertyList);
        this.context = context;
        this.propertyList = propertyList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);


        TextView textViewLocation = (TextView)listViewItem.findViewById(R.id.textViewLocation);
        TextView textViewRent = (TextView)listViewItem.findViewById(R.id.textViewRent);

        Properties properties = propertyList.get(position);

        textViewLocation.setText(properties.getPropertyLocation());
        textViewRent.setText(properties.getPropertyRental());


        return listViewItem;
    }


}

