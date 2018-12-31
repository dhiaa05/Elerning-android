package com.example.dhiaapc.e_learning.model;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dhiaapc.e_learning.EtudSpaceActivity;
import com.example.dhiaapc.e_learning.R;

import java.util.List;

public class SpecAdapter extends ArrayAdapter<Specialite>{

    Activity activity;
    List<Specialite> items;
    int itemResourcedId;

    public SpecAdapter(Activity activity, int itemResourcedId, List<Specialite> listSpec) {
        super(activity,itemResourcedId,listSpec);
        this.activity = activity;
        this.itemResourcedId = itemResourcedId;
        this.items = listSpec;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        View layout = convertView;
        if(convertView == null)
        {
            LayoutInflater inflater = activity.getLayoutInflater();
            layout = inflater.inflate(itemResourcedId,parent,false);
        }

        TextView nameSpec = (TextView) layout.findViewById(R.id.nomSpec);
        TextView nbrModule = (TextView) layout.findViewById(R.id.nmbModule);

        nameSpec.setText(items.get(position).nomSpec);
        nbrModule.setText(items.get(position).nmbModule);
        return layout;
    }

}
