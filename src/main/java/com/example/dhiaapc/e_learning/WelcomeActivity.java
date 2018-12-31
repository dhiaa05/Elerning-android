package com.example.dhiaapc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {
    db_elearning db = new db_elearning(WelcomeActivity.this);
    basedonne base = new basedonne(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }


        //Toast.makeText(this,user.getText().toString(),Toast.LENGTH_LONG).show();


    public void logIn(View view) {
        Intent intent;
        switch(view.getId())
        {
           case R.id.logEns:
                intent = new Intent(this,EnsLogInActivity.class);
                startActivity(intent);
                break;
            case R.id.logEtud:
                intent = new Intent(this,EtudLogInActivity.class);
                startActivity(intent);
                break;
            case R.id.go_registre_etud:
                 intent = new Intent(this, RegistrerActivity.class);
                 startActivity(intent);
            case R.id.go_registre_ens:
                intent = new Intent(this, RegistreEnsActivity.class);
                startActivity(intent);

        }
    }


}
