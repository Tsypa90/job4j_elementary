package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        boolean checkYear = true;
        if (year % 400 == 0 || year % 4 == 0) {
            return true;
        } else if (year % 100 != 0) {
            return false;
        }
        return checkYear;
    }
}
