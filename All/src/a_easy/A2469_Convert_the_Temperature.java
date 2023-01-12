package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A2469_Convert_the_Temperature {
    @Test
    public void unitTest() {
        //data
        double celsius = 36.5;
        double[] a = { celsius + 273.15, celsius * 1.80 + 32.00 };
        Assertions.assertEquals(a, convertTemperature(celsius));
    }

    public double[] convertTemperature(double celsius) {
        return new double[]{ celsius + 273.15, celsius * 1.80 + 32.00 };
    }
}
