package com.example.dhiaapc.e_learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dhiaapc.e_learning.model.SpecAdapter;
import com.example.dhiaapc.e_learning.model.Specialite;

import java.util.ArrayList;
import java.util.List;

public class TeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        final ListView listViewSpec = (ListView) findViewById(R.id.specList);

        List<Specialite> listSpec = new ArrayList<Specialite>();

        listSpec.add(new Specialite("informatique","5"));
        listSpec.add(new Specialite("math","5"));
        listSpec.add(new Specialite("phezique","5"));
        listSpec.add(new Specialite("leshee","5"));


        SpecAdapter adapter =
                new SpecAdapter(TeacherActivity.this, R.layout.specistview,listSpec);
        listViewSpec.setAdapter(adapter);

        listViewSpec.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String)listViewSpec.getItemAtPosition(position);
                // Toast.makeText(getApplicationContext(),"feeg",Toast.LENGTH_SHORT).show();
                ;
            }
        });
    }
}
