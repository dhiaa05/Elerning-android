package com.example.dhiaapc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dhiaapc.e_learning.model.SpecAdapter;
import com.example.dhiaapc.e_learning.model.Specialite;
import com.example.dhiaapc.e_learning.model.module;
import com.example.dhiaapc.e_learning.model.moduleAdapter;

import java.util.ArrayList;
import java.util.List;

public class ModuleSpace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_space);

       final ListView listViewSpec = (ListView) findViewById(R.id.listModule);

        List<module> listSpec = new ArrayList<module>();

        listSpec.add(new module("informatique","5svsvsvsvsvegvsde"));
          listSpec.add(new module("math","5"));
          listSpec.add(new module("phezique","5"));
           listSpec.add(new module("leshee","5"));



        moduleAdapter adapter =

                new moduleAdapter(ModuleSpace.this, R.layout.activity_module_space,listSpec);
        listViewSpec.setAdapter(adapter);


    }
}
