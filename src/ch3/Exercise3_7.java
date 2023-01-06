package ch3;

import static java.lang.Math.round;

public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = round((5/9f) * (fahrenheit - 32) * 100)/100.0f; //C = 5/9 ×(F - 32)
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}