package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            } else {
                return prime;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        CheckPrimeNumber.check(2);
    }
}
