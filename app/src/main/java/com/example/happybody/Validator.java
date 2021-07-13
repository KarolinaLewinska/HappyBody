package com.example.happybody;

import android.widget.EditText;

class Validator {
    static boolean checkFieldsAreNotEmpty(EditText age, EditText weight, EditText height) {
        if (age.getText().length() == 0) {
            age.setError("Podaj swój wiek!");
            return false;
        }
        if (weight.getText().length() == 0) {
            weight.setError("Podaj swoją wagę!");
            return false;
        }
        if (height.getText().length() == 0) {
            height.setError("Podaj swój wzrost!");
            return false;
        }
        
        return true;
    }
    
    static boolean checkProperNumberRange(EditText age, EditText weight, EditText height) {
        double minValue = 1;
        double maxAge = 120;
        double maxHeight = 210;
        double maxWeight = 350;

        String ageToString = age.getText().toString();
        String heightToString = height.getText().toString();
        String weightToString = weight.getText().toString();

        char firstAgeLetter = age.getText().charAt(0);
        char firstWeightLetter = weight.getText().charAt(0);
        char firstHeightLetter = height.getText().charAt(0);

        double ageToDouble = Double.parseDouble(ageToString);
        double weightToDouble = Double.parseDouble(weightToString);
        double heightToDouble = Double.parseDouble(heightToString);

        if (ageToDouble < minValue || ageToDouble > maxAge || firstAgeLetter == '0') {
            age.setError("Nieprawidłowa wartość!");
            return false;
        }
        if (weightToDouble < minValue || weightToDouble > maxWeight || firstWeightLetter == '0') {
            weight.setError("Nieprawidłowa wartość!");
            return false;
        }
        if (heightToDouble < minValue || heightToDouble > maxHeight || firstHeightLetter == '0') {
            height.setError("Nieprawidłowa wartość!");
            return false;
        }
        
        return true;
    }
}
