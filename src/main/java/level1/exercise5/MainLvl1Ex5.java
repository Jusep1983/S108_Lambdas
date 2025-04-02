package level1.exercise5;

import java.lang.Math;

public class MainLvl1Ex5 {
    public static void main(String[] args) {

        MathsMethods assignPi = () -> (Math.PI);
        double result = assignPi.getPiValue();
        System.out.println("The value of the number pi is " + result);
    }

    @FunctionalInterface
    public interface MathsMethods {
        double getPiValue();
    }
}
