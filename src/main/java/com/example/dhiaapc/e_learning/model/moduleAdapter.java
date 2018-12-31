package com.example.dhiaapc.e_learning.model;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.dhiaapc.e_learning.R;

import java.util.List;

public class moduleAdapter extends ArrayAdapter<module> {

    Activity activity;
    List<module> items;
    int itemResourcedId;

    public moduleAdapter( Activity activity, int itemResourcedId, List<module> items) {

        super(activity, itemResourcedId,items);

        this.activity = activity;
        this.itemResourcedId = itemResourcedId;
        this.items = items;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        View layout = convertView;
        if(convertView == null)
        {
            LayoutInflater inflater = activity.getLayoutInflater();
            layout = inflater.inflate(itemResourcedId,parent,false);
        }

        TextView nameSpec = layout.findViewById(R.id.nomModule);
        TextView nbrModule =  layout.findViewById(R.id.descModule);

      // nameSpec.setText("d:f,nbdfnb");
       // nbrModule.setText("kuvbfdknbhbsrh");
        return layout;
    }
}
