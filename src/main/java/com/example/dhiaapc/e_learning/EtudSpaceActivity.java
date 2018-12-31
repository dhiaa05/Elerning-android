package com.example.dhiaapc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.dhiaapc.e_learning.model.SpecAdapter;
import com.example.dhiaapc.e_learning.model.Specialite;

import java.util.ArrayList;
import java.util.List;

public class EtudSpaceActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etud_space);

        final ListView listViewSpec = (ListView) findViewById(R.id.specList);

        List<Specialite> listSpec = new ArrayList<Specialite>();

        listSpec.add(new Specialite("informatique","5"));
        listSpec.add(new Specialite("math","5"));
        listSpec.add(new Specialite("phezique","5"));
        listSpec.add(new Specialite("leshee","5"));



    SpecAdapter adapter =
            new SpecAdapter(EtudSpaceActivity.this, R.layout.specistview,listSpec);
        listViewSpec.setAdapter(adapter);


        listViewSpec.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Intent intent1 = new Intent(view.getContext(),ModuleSpace.class);
                //String itemValue = (String)listViewSpec.getItemAtPosition(position);
                //Toast.makeText(getApplicationContext(),"feeg",Toast.LENGTH_SHORT).show();
                startActivity(intent1);
            }
        });
    }


}
