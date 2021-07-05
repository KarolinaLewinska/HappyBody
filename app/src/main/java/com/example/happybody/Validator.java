package com.example.happybody;

import android.widget.EditText;

class Validator {
    EditText age, height, weight;
    boolean checkFieldsAreNotEmpty(EditText age, EditText height, EditText weight) {

        if (age.getText().length() == 0) {
            age.setError("Podaj swój wiek!");
            return false;
        }

        if (height.getText().length() == 0) {
            height.setError("Podaj swój wzrost!");
            return false;
        }

        if (weight.getText().length() == 0) {
            weight.setError("Podaj swoją wagę!");
            return false;
        }
        return true;
    }
}
