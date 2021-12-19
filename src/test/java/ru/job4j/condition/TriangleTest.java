package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void trueExist() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void falseExist() {
        double ab = 2;
        double ac = 2;
        double bc = 5;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}