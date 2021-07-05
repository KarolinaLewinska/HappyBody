package com.example.happybody;

import android.widget.EditText;
import static java.lang.Math.round;

class BasalMetabolicRate {
    double countWomenBasalMetabolicRate(EditText age, EditText height, EditText weight) {
        String ageToString = age.getText().toString();
        String heightToString = height.getText().toString();
        String weightToString = weight.getText().toString();

        double ageToDouble = Double.parseDouble(ageToString);
        double heightToDouble = Double.parseDouble(heightToString);
        double weightToDouble = Double.parseDouble(weightToString);

        double basalMetabolicRateResult =
                round(((9.99 * weightToDouble) + (6.25 * heightToDouble) - (4.92 * ageToDouble) - 161) * 100.0) / 100.0;

        return basalMetabolicRateResult;
    }

    double countMenBasalMetabolicRate(EditText age, EditText height, EditText weight) {
        String ageToString = age.getText().toString();
        String heightToString = height.getText().toString();
        String weightToString = weight.getText().toString();

        double ageToDouble = Double.parseDouble(ageToString);
        double heightToDouble = Double.parseDouble(heightToString);
        double weightToDouble = Double.parseDouble(weightToString);

        double basalMetabolicRateResult =
                round(((9.99 * weightToDouble) + (6.25 * heightToDouble) - (4.92 * ageToDouble) + 5) * 100.0) / 100.0;

        return basalMetabolicRateResult;
    }
}
