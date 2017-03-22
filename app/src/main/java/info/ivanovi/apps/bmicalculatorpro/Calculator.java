package info.ivanovi.apps.bmicalculatorpro;

/**
 * Created by Jordan on 21.3.2017 г..
 */

public class Calculator {

    public static double calculateBMI(double weight, int height) {
        double heightInMeters = (double) height / (double) 100;
        return calculateBMI(weight, heightInMeters);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

}
