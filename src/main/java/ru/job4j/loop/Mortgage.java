package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        amount = (amount * (percent / 100)) + amount;
        while (salary < amount) {
            double dept = amount - salary;
            amount  = (dept * (percent / 100)) + dept;
            year++;
        }
        return year;
    }
}
