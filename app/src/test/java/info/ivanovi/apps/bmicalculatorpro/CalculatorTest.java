package info.ivanovi.apps.bmicalculatorpro;

import org.junit.Assert;
import org.junit.Test;

import info.ivanovi.apps.bmicalculatorpro.core.BMICalculator;

public class CalculatorTest {
    @Test
    public void bmi_isCorrect() throws Exception {
        Assert.assertEquals(20d, BMICalculator.calculateBMI(80, 200).getResult(), 0);
        Assert.assertEquals(24.4d, BMICalculator.calculateBMI(81.7, 1.83).getResult(), 0.01);
    }
}