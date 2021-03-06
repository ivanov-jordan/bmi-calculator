package info.ivanovi.apps.bmicalculatorpro.core;

import info.ivanovi.apps.bmicalculatorpro.model.Result;

public class BMICalculator {

    public static Result calculateBMI(double weight, int height) {
        double heightInMeters = (double) height / (double) 100;
        return calculateBMI(weight, heightInMeters);
    }

    public static Result calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        return new Result(bmi);
    }

}
