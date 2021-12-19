package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax2To5Then5() {
        int left = 2;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6To5Then6() {
        int left = 6;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5tTo5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

}