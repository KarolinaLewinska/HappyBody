package com.example.happybody;

import android.widget.EditText;
import android.widget.TextView;
import static java.lang.Math.round;

class BodyMassIndex {

    double countBodyMassIndex(EditText height, EditText weight) {
        String heightToString, weightToString;
        double heightToDouble, weightToDouble, bodyMassIndexResult;

        heightToString = height.getText().toString();
        weightToString = weight.getText().toString();

        heightToDouble = Double.parseDouble(heightToString);
        weightToDouble = Double.parseDouble(weightToString);

        bodyMassIndexResult = round(weightToDouble / Math.pow((heightToDouble / 100), 2) * 100.0) / 100.0;
        return bodyMassIndexResult;
    }
    void showBodyMassIndexInfoView(double bodyMassIndex, TextView infoView) {

        if (bodyMassIndex < 16) {
            infoView.setText("Jesteś wygłodzony/a!\nPilnie skontakuj się z lekarzem!");
        } else if (bodyMassIndex >= 16 && bodyMassIndex< 17) {
            infoView.setText("Jesteś wychudzony/a!\nSkontakuj się z lekarzem!");
        } else if (bodyMassIndex >= 17 && bodyMassIndex < 18.5) {
            infoView.setText("Masz niedowagę!\nZadbaj o siebie!");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            infoView.setText("Twoja waga jest prawidłowa!\nTak trzymaj!");
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            infoView.setText("Masz nadwagę!\nZadbaj o siebie!");
        } else if (bodyMassIndex >= 30 && bodyMassIndex < 35) {
            infoView.setText("Masz I stopień otyłości!\nSkontakuj się z lekarzem!");
        } else if (bodyMassIndex >= 35 && bodyMassIndex < 40) {
            infoView.setText("Masz II stopień otyłości!\nSkontakuj się z lekarzem!");
        } else if (bodyMassIndex >= 40) {
            infoView.setText("Jesteś skrajnie otyły/a!\nPilnie skontakuj się z lekarzem!");
        }
    }
}
