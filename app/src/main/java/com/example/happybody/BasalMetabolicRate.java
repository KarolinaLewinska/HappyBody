package com.example.happybody;

import android.widget.EditText;
import static java.lang.Math.round;

class BasalMetabolicRate {
    static double countWomenBasalMetabolicRate(EditText age, EditText weight, EditText height) {
        String ageToString = age.getText().toString();
        String weightToString = weight.getText().toString();
        String heightToString = height.getText().toString();

        double ageToDouble = Double.parseDouble(ageToString);
        double weightToDouble = Double.parseDouble(weightToString);
        double heightToDouble = Double.parseDouble(heightToString);

        double basalMetabolicRateResult =
                round(((9.99 * weightToDouble) + (6.25 * heightToDouble) - (4.92 * ageToDouble) - 161) * 100.0) / 100.0;

        return basalMetabolicRateResult;
    }
    static double countMenBasalMetabolicRate(EditText age, EditText weight, EditText height) {
        String ageToString = age.getText().toString();
        String weightToString = weight.getText().toString();
        String heightToString = height.getText().toString();

        double ageToDouble = Double.parseDouble(ageToString);
        double weightToDouble = Double.parseDouble(weightToString);
        double heightToDouble = Double.parseDouble(heightToString);

        double basalMetabolicRateResult =
                round(((9.99 * weightToDouble) + (6.25 * heightToDouble) - (4.92 * ageToDouble) + 5) * 100.0) / 100.0;

        return basalMetabolicRateResult;
    }
}
