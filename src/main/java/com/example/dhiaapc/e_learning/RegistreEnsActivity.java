package com.example.dhiaapc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.dhiaapc.e_learning.model.Enseignant;

public class RegistreEnsActivity extends AppCompatActivity {

    public Enseignant enseignant = new Enseignant();
    private db_elearning db = new db_elearning(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registre_ens);
    }

    public void RegisterEns(View view) {
        postDataToSQLite();
        Intent intent = new Intent(this,WelcomeActivity.class);
        startActivity(intent);
    }


    private void postDataToSQLite()
    {
        EditText nom = (EditText) findViewById(R.id.nom);
        EditText prenom = (EditText) findViewById(R.id.R_E_prenom);
        EditText password = (EditText) findViewById(R.id.R_E_password);
        EditText email = (EditText) findViewById(R.id.R_E_email);
        EditText dep = (EditText) findViewById(R.id.R_E_dep);

        enseignant.setNom(String.valueOf(nom.getText().toString().trim()));
        enseignant.setPrenom(String.valueOf(prenom.getText().toString().trim()));
        enseignant.setemail(String.valueOf(email.getText().toString().trim()));
        enseignant.setDep(String.valueOf(dep.getText().toString().trim()));
        enseignant.setPassword(String.valueOf(password.getText().toString().trim()));
        db.insertTeacher(enseignant);


    }
}
