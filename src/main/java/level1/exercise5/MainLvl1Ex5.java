package level1.exercise5;

import java.lang.Math;

public class MainLvl1Ex5 implements PiInterface {
    public static void main(String[] args) {

        PiInterface assignPi = () -> (Math.PI);
        double result = assignPi.getPiValue();
        System.out.println("The value of the number pi is " + result);
    }


}
