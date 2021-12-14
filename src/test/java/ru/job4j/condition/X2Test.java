package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test

    public void result() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

}