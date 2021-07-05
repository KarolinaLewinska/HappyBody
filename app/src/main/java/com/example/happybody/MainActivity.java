package com.example.happybody;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button countBodyMassIndexAndBasalMetabolicRate;
    private RadioButton woman, man;
    private EditText userAge, userHeight, userWeight;
    private TextView bodyMassIndexView, BMR, infoView;
    private ImageView red, yellow, green;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        woman = (RadioButton) findViewById(R.id.woman);
        man = (RadioButton) findViewById(R.id.man);
        userAge = (EditText) findViewById(R.id.age);
        userWeight = (EditText) findViewById(R.id.weight);
        userHeight = (EditText) findViewById(R.id.height);
        bodyMassIndexView = (TextView) findViewById(R.id.BMI);
        infoView = (TextView) findViewById(R.id.info);
        BMR = (TextView) findViewById(R.id.BMR);
        countBodyMassIndexAndBasalMetabolicRate = (Button) findViewById(R.id.count);
        red = (ImageView) findViewById(R.id.red);
        yellow = (ImageView) findViewById(R.id.yellow);
        green = (ImageView) findViewById(R.id.green);

        countBodyMassIndexAndBasalMetabolicRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validator validator = new Validator();
                validator.checkFieldsAreNotEmpty(userAge, userHeight, userWeight);
                BodyMassIndex bodyMassIndex = new BodyMassIndex();
              
                if (validator.checkFieldsAreNotEmpty(userAge, userHeight, userWeight)) {
                    double bodyMassIndexResult = bodyMassIndex
                            .countBodyMassIndex(userHeight, userWeight);
                    String bodyMassIndexResultToString = String.valueOf(bodyMassIndexResult);
                    bodyMassIndexView.setText("BMI: " + bodyMassIndexResultToString);
                   /* bodyMassIndex.showBodyMassIndexInfoView(bodyMassIndexResult, infoView);
                    infoView.setText();*/



                   /* if (bodyMassIndex < 16) {
                        info.setText("Jesteś wygłodzony/a!\nPilnie skontakuj się z lekarzem!");
                        red.animate().alpha(1);
                        yellow.animate().alpha(0);
                        green.animate().alpha(0);
                    } else if (bodyMassIndex >= 16 && bodyMassIndex < 17) {
                        info.setText("Jesteś wychudzony/a!\nSkontakuj się z lekarzem!");
                        red.animate().alpha(1);
                        yellow.animate().alpha(0);
                        green.animate().alpha(0);
                    } else if (bodyMassIndex >= 17 && bodyMassIndex < 18.5) {
                        info.setText("Masz niedowagę!\nZadbaj o siebie!");
                        red.animate().alpha(0);
                        yellow.animate().alpha(1);
                        green.animate().alpha(0);
                    } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
                        info.setText("Twoja waga jest prawidłowa!\nTak trzymaj!");
                        red.animate().alpha(0);
                        yellow.animate().alpha(0);
                        green.animate().alpha(1);
                    } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
                        info.setText("Masz nadwagę!\nZadbaj o siebie!");
                        red.animate().alpha(0);
                        yellow.animate().alpha(1);
                        green.animate().alpha(0);
                    } else if (bodyMassIndex >= 30 && bodyMassIndex < 35) {
                        info.setText("Masz I stopień otyłości!\nSkontakuj się z lekarzem!");
                        red.animate().alpha(1);
                        yellow.animate().alpha(0);
                        green.animate().alpha(0);
                    } else if (bodyMassIndex >= 35 && bodyMassIndex < 40) {
                        info.setText("Masz II stopień otyłości!\nSkontakuj się z lekarzem!");
                        red.animate().alpha(1);
                        yellow.animate().alpha(0);
                        green.animate().alpha(0);
                    } else if (bodyMassIndex >= 40) {
                        info.setText("Jesteś skrajnie otyły/a!\nPilnie skontakuj się z lekarzem!");
                        red.animate().alpha(1);
                        yellow.animate().alpha(0);
                        green.animate().alpha(0);
                    }

                    if (woman.isChecked()) {
                        double DBMR =  round(((9.99 * Dweight) + (6.25 * Dheight) - (4.92 * Dage) - 161) * 100.0) / 100.0;
                        String SBMR = String.valueOf(DBMR);
                        BMR.setText("BMR: " + SBMR + " kcal");
                    } else if (man.isChecked()) {
                        double DBMR = round(((9.99 * Dweight) + (6.25 * Dheight) - (4.92 * Dage) + 5) * 100.0) / 100.0;
                        String SBMR = String.valueOf(DBMR);
                        BMR.setText("BMR: " + SBMR + " kcal");
                    }*/
                }
            }
        });
    }

}
