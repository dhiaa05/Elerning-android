package com.example.dhiaapc.e_learning;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class InputVerification {

    private Context context;

    public InputVerification(Context context)
    {
        this.context = context;
    }

    //****************************** Methode pour test que le input est remplir or nop ****************************//

    public boolean isEditTextFilled(EditText nomInput, String message)
    {
        String value = nomInput.getText().toString().trim();

        if(value.isEmpty())
        {
            nomInput.setText(message);
            hideKeyboaredFrom(nomInput);
            return false;
        }
        else
        return true;
    }

    private void hideKeyboaredFrom(View view)
    {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

}
