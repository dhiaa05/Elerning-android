package com.example.dhiaapc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dhiaapc.e_learning.model.Enseignant;
import com.example.dhiaapc.e_learning.model.Etudiant;
import com.example.dhiaapc.e_learning.model.Perssone;

public class RegistrerActivity extends AppCompatActivity {

    public Etudiant etudiant = new Etudiant();
    private db_elearning db = new db_elearning(this);
    basedonne base = new basedonne(this );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrer);

    }

    public void Register(View view) {

        postDataToSQLite();
       // Intent intent = new Intent(this,WelcomeActivity.class);
       // startActivity(intent);
        }

        private void postDataToSQLite()
        {
            EditText nom = (EditText) findViewById(R.id.nom);
            EditText prenom = (EditText) findViewById(R.id.R_E_prenom);
            EditText password = (EditText) findViewById(R.id.R_E_password);
            EditText email = (EditText) findViewById(R.id.R_E_email);
            EditText dep = (EditText) findViewById(R.id.R_E_dep);

            etudiant.setNom(String.valueOf(nom.getText().toString().trim()));
            etudiant.setPrenom(String.valueOf(prenom.getText().toString().trim()));
            etudiant.setemail(String.valueOf(email.getText().toString().trim()));
            etudiant.setDep(String.valueOf(dep.getText().toString().trim()));
            etudiant.setPassword(String.valueOf(password.getText().toString().trim()));

            if(!db.insertEtudiant(etudiant))
            {
                Toast.makeText(this,"okayyyyyyyyy",Toast.LENGTH_LONG).show();
            }
            else
                Toast.makeText(this,"nooooooooope",Toast.LENGTH_LONG).show();




        }
}
