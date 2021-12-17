package ru.job4j.condition;

public class Comparison {

    public static void whatNumberMore(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("Number A more then B and C");
            } else {
                System.out.println("Number C more then A and B");
            }
        } else {
            if (b > c) {
                System.out.println("Number B more then A and C");
            } else {
                System.out.println("Number C more then A and B");
            }
        }
    }

     public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 2;
        Comparison.whatNumberMore(a, b, c);
    }
}


