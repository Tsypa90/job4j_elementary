package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 1; row < array.length; row++) {
            for (int cell = 1; cell < array[row].length; cell++) {
                array[row][cell] = row * cell;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int size = 2;
        System.out.println(multiple(size));
    }
}
