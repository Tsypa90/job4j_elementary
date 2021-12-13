package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double four = Math.pow(second, 2);
        double five = third + four;
        double rsl = Math.sqrt(five);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 2, 4, 5);
        System.out.println("result (2, 2) to (4, 5) " + result);
    }
}
