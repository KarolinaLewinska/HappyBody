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
    private RadioButton woman;
    private EditText userAge, userHeight, userWeight;
    private TextView bodyMassIndexView, basalMetabolicRateView, infoView;
    private ImageView redLight, yellowLight, greenLight;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countBodyMassIndexAndBasalMetabolicRate = (Button) findViewById(R.id.count);
        woman = (RadioButton) findViewById(R.id.woman);
        userAge = (EditText) findViewById(R.id.age);
        userHeight = (EditText) findViewById(R.id.height);
        userWeight = (EditText) findViewById(R.id.weight);
        bodyMassIndexView = (TextView) findViewById(R.id.BMI);
        basalMetabolicRateView = (TextView) findViewById(R.id.BMR);
        infoView = (TextView) findViewById(R.id.infoView);
        redLight = (ImageView) findViewById(R.id.red);
        yellowLight = (ImageView) findViewById(R.id.yellow);
        greenLight = (ImageView) findViewById(R.id.green);

        countBodyMassIndexAndBasalMetabolicRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Validator.checkFieldsAreNotEmpty(userAge, userWeight, userHeight)) {
                    if (Validator.checkProperNumberRange(userAge, userWeight, userHeight)) {
                        double bodyMassIndexResult = BodyMassIndex.countBodyMassIndex(userWeight, userHeight);
                        String bodyMassIndexResultToString = String.valueOf(bodyMassIndexResult);
                        bodyMassIndexView.setText("BMI: " + bodyMassIndexResultToString);

                        String info = BodyMassIndex.showBodyMassIndexInfo(bodyMassIndexResult);
                        infoView.setText(info);
                        BodyMassIndex.showProperLightsAnimations(redLight, yellowLight, greenLight, bodyMassIndexResult);
                        countProperBasalMetabolicRate();
                    }
                }
            }
        });
    }
    void countProperBasalMetabolicRate() {
        if (woman.isChecked()) {
            double basalMetabolicRateResult = BasalMetabolicRate.countWomenBasalMetabolicRate(userAge, userWeight, userHeight);
            String basalMetabolicRateResultToString = String.valueOf(basalMetabolicRateResult);
            basalMetabolicRateView.setText("BMR: " + basalMetabolicRateResultToString + " kcal");
        } else {
            double basalMetabolicRateResult = BasalMetabolicRate.countMenBasalMetabolicRate(userAge, userWeight, userHeight);
            String basalMetabolicRateResultToString = String.valueOf(basalMetabolicRateResult);
            basalMetabolicRateView.setText("BMR: " + basalMetabolicRateResultToString + " kcal");
        }
    }
}
