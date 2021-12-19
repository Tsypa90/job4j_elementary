package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean max = left >= right;
        int result = max ? left : right;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int max = Max.max(6, 5);
    }
}
