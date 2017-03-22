package info.ivanovi.apps.bmicalculatorpro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorTest {
    @Test
    public void bmi_isCorrect() throws Exception {
        assertEquals(20, Calculator.calculateBMI(80, 200), 0);
        assertEquals(24.4, Calculator.calculateBMI(81.7, 1.83), 0.01);
    }
}