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
    private TextView bodyMassIndexView, basalMetabolicRateView, infoView;
    private ImageView redLight, yellowLight, greenLight;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countBodyMassIndexAndBasalMetabolicRate = (Button) findViewById(R.id.count);
        woman = (RadioButton) findViewById(R.id.woman);
        man = (RadioButton) findViewById(R.id.man);
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
                Validator validator = new Validator();
                BodyMassIndex bodyMassIndex = new BodyMassIndex();
                BasalMetabolicRate basalMetabolicRate = new BasalMetabolicRate();
              
                if (validator.checkFieldsAreNotEmpty(userAge, userHeight, userWeight)) {
                    double bodyMassIndexResult = bodyMassIndex.countBodyMassIndex(userHeight, userWeight);
                    String bodyMassIndexResultToString = String.valueOf(bodyMassIndexResult);
                    bodyMassIndexView.setText("BMI: " + bodyMassIndexResultToString);

                    String info = bodyMassIndex.showBodyMassIndexInfo(bodyMassIndexResult);
                    infoView.setText(info);
                    bodyMassIndex.showProperLightsAnimations(redLight, yellowLight, greenLight, bodyMassIndexResult);

                    if (woman.isChecked()) {
                        double basalMetabolicRateResult = basalMetabolicRate.countWomenBasalMetabolicRate(userAge, userHeight, userWeight);
                        String basalMetabolicRateResultToString = String.valueOf(basalMetabolicRateResult);
                        basalMetabolicRateView.setText("BMR: " + basalMetabolicRateResultToString + " kcal");
                    } else {
                        double basalMetabolicRateResult = basalMetabolicRate.countMenBasalMetabolicRate(userAge, userHeight, userWeight);
                        String basalMetabolicRateResultToString = String.valueOf(basalMetabolicRateResult);
                        basalMetabolicRateView.setText("BMR: " + basalMetabolicRateResultToString + " kcal");
                    }
                }
            }
        });
    }
}
