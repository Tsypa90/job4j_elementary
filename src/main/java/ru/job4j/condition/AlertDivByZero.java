package ru.job4j.condition;

import java.awt.*;

public class AlertDivByZero {

    public static void main(String[] args) {
        possibleDiv(5);
        possibleDiv(-5);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
