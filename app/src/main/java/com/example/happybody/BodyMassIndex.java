package com.example.happybody;

import android.widget.EditText;
import android.widget.ImageView;
import static java.lang.Math.round;

class BodyMassIndex {
    static double countBodyMassIndex(EditText weight, EditText height) {
        String weightToString = weight.getText().toString();
        String heightToString = height.getText().toString();

        double weightToDouble = Double.parseDouble(weightToString);
        double heightToDouble = Double.parseDouble(heightToString);

        double bodyMassIndexResult = round(weightToDouble / Math.pow((heightToDouble / 100), 2) * 100.0) / 100.0;
        return bodyMassIndexResult;
    }
    static String showBodyMassIndexInfo(double bodyMassIndex) {
        String infoText = "";

        if (bodyMassIndex < 16) {
            infoText =  "Jesteś wygłodzony/a!\nPilnie skontakuj się z lekarzem!";
            return infoText;
        } else if (bodyMassIndex >= 16 && bodyMassIndex < 17) {
            infoText = "Jesteś wychudzony/a!\nSkontakuj się z lekarzem!";
            return infoText;
        } else if (bodyMassIndex >= 17 && bodyMassIndex < 18.5) {
            infoText = "Masz niedowagę!\nZadbaj o siebie!";
            return infoText;
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            infoText = "Twoja waga jest prawidłowa!\nTak trzymaj!";
            return infoText;
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            infoText= "Masz nadwagę!\nZadbaj o siebie!";
            return infoText;
        } else if (bodyMassIndex >= 30 && bodyMassIndex < 35) {
            infoText = "Masz I stopień otyłości!\nSkontakuj się z lekarzem!";
            return infoText;
        } else if (bodyMassIndex >= 35 && bodyMassIndex < 40) {
            infoText = "Masz II stopień otyłości!\nSkontakuj się z lekarzem!";
            return infoText;
        } else {
            infoText = "Jesteś skrajnie otyły/a!\nPilnie skontakuj się z lekarzem!";
            return infoText;
        }
    }

    static void showProperLightsAnimations(ImageView redLight, ImageView yellowLight, ImageView greenLight, double bodyMassIndex) {
        if (bodyMassIndex >= 17 && bodyMassIndex < 18.5 || bodyMassIndex >= 25 && bodyMassIndex < 30) {
            redLight.animate().alpha(0);
            yellowLight.animate().alpha(1);
            greenLight.animate().alpha(0);
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            redLight.animate().alpha(0);
            yellowLight.animate().alpha(0);
            greenLight.animate().alpha(1);
        } else {
            redLight.animate().alpha(1);
            yellowLight.animate().alpha(0);
            greenLight.animate().alpha(0);
        }
    }
}
