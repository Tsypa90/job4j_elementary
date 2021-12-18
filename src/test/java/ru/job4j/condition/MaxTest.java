package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMaxLeftToRightThenRight() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}