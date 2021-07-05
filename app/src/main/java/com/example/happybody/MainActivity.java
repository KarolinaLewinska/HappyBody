package com.example.happybody;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import static java.lang.Math.round;

public class MainActivity extends AppCompatActivity {
    private Button count;
    private RadioButton woman, man;
    private EditText age, height, weight;
    private TextView BMI, BMR, info;
    private ImageView red, yellow, green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        woman = (RadioButton) findViewById(R.id.woman);
        man = (RadioButton) findViewById(R.id.man);
        age = (EditText) findViewById(R.id.age);
        weight = (EditText) findViewById(R.id.weight);
        height = (EditText) findViewById(R.id.height);
        BMI = (TextView) findViewById(R.id.BMI);
        info = (TextView) findViewById(R.id.info);
        BMR = (TextView) findViewById(R.id.BMR);
        count = (Button) findViewById(R.id.count);
        red = (ImageView) findViewById(R.id.red);
        yellow = (ImageView) findViewById(R.id.yellow);
        green = (ImageView) findViewById(R.id.green);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (age.getText().length() == 0) 
                    age.setError("Podaj wiek!");
                if (weight.getText().length() == 0) 
                    weight.setError("Podaj wagę!");
                if (height.getText().length() == 0) 
                    height.setError("Podaj wzrost!");
              
                if (age.getText().length() != 0 && weight.getText().length() != 0 && height.getText().length() != 0) {
                    String Sweight = weight.getText().toString();
                    double Dweight = Double.parseDouble(Sweight);
                    String Sheight = height.getText().toString();
                    double Dheight = Double.parseDouble(Sheight);
                    String Sage = age.getText().toString();
                    int Dage = Integer.parseInt(Sage);

                    double DBMI = round(Dweight / Math.pow((Dheight / 100), 2) * 100.0) / 100.0;
                    String SBMI = String.valueOf(DBMI);
                    BMI.setText("BMI: " + SBMI);

                    if (DBMI < 16) {
                        info.setText("Jesteś wygłodzony/a!\nPilnie skontakuj się z lekarzem!");
                        red.animate().alpha(1);
                        yellow.animate().alpha(0);
                        green.animate().alpha(0);
                    } else if (DBMI >= 16 && DBMI < 17) {
                        info.setText("Jesteś wychudzony/a!\nSkontakuj się z lekarzem!");
                        red.animate().alpha(1);
                        yellow.animate().alpha(0);
                        green.animate().alpha(0);
                    } else if (DBMI >= 17 && DBMI < 18.5) {
                        info.setText("Masz niedowagę!\nZadbaj o siebie!");
                        red.animate().alpha(0);
                        yellow.animate().alpha(1);
                        green.animate().alpha(0);
                    } else if (DBMI >= 18.5 && DBMI < 25) {
                        info.setText("Twoja waga jest prawidłowa!\nTak trzymaj!");
                        red.animate().alpha(0);
                        yellow.animate().alpha(0);
                        green.animate().alpha(1);
                    } else if (DBMI >= 25 && DBMI < 30) {
                        info.setText("Masz nadwagę!\nZadbaj o siebie!");
                        red.animate().alpha(0);
                        yellow.animate().alpha(1);
                        green.animate().alpha(0);
                    } else if (DBMI >= 30 && DBMI < 35) {
                        info.setText("Masz I stopień otyłości!\nSkontakuj się z lekarzem!");
                        red.animate().alpha(1);
                        yellow.animate().alpha(0);
                        green.animate().alpha(0);
                    } else if (DBMI >= 35 && DBMI < 40) {
                        info.setText("Masz II stopień otyłości!\nSkontakuj się z lekarzem!");
                        red.animate().alpha(1);
                        yellow.animate().alpha(0);
                        green.animate().alpha(0);
                    } else if (DBMI >= 40) {
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
                    }
                }
            }
        });
    }
}
