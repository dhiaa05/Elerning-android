package com.example.dhiaapc.e_learning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class EtudLogInActivity extends AppCompatActivity {

    /***********************Identifier la base de donnes ***********************/
    db_elearning db = new db_elearning(this);
    basedonne base = new basedonne(this );


    //************ **************************//
    InputVerification inputVerification = new InputVerification(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etud_log_in);
    }

    public void etudLogin(View view) {

        verifFromSQLite();
    }

    /***********************methode qui verif les information ***********************/
    private void verifFromSQLite()
    {
        /***********************Identifier les edit text ***********************/
        EditText nom = (EditText) findViewById(R.id.etudNom);
        EditText pass = (EditText) findViewById(R.id.etudPass);
        //,pass.getText().toString().trim()
        if(!inputVerification.isEditTextFilled(nom,"Error in your nom"))
            return;
        if(!inputVerification.isEditTextFilled(pass,"error in your password"))
            return;
        if(!db.checkemailEtd(nom.getText().toString().trim(),pass.getText().toString().trim()))
        {
            Intent intent = new Intent(this,EtudSpaceActivity.class);
            intent.putExtra("nom", nom.getText().toString().trim());
            startActivity(intent);
        }
    }


}
