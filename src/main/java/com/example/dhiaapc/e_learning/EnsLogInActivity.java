package com.example.dhiaapc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnsLogInActivity extends AppCompatActivity {

    /***********************Identifier la base de donnes ***********************/
    db_elearning db = new db_elearning(this);
    basedonne base = new basedonne(this);

    InputVerification inputVerification = new InputVerification(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ens_log_in);

    }

    public void ensLogin(View view) {

        verifFromSQLite();
    }

    /***********************methode qui verif les information ***********************/
    private void verifFromSQLite()
    {

        /***********************Identifier les edit text ***********************/
        EditText nom = (EditText) findViewById(R.id.ensNom);
        EditText pass = (EditText) findViewById(R.id.ensPass);

        //,pass.getText().toString().trim()
        if(!inputVerification.isEditTextFilled(nom,"Error in your nom"))
            return;
        if(!inputVerification.isEditTextFilled(pass,"error in your password"))
            return;
        if(!db.checkemailEns(nom.getText().toString().trim(),pass.getText().toString().trim()))
        {
           Intent intent = new Intent(this,TeacherActivity.class);
            intent.putExtra("nom", nom.getText().toString().trim());
            startActivity(intent);
        }
    }
}
