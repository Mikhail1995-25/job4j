package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square(){
        int in = 4;
        int in1 = 1;
        double expected = 2.0;
        double out = SqArea.square(in, in1);
        Assert.assertEquals(expected, out, 0.001);
    }
    @Test
    public void square1(){
        int in = 6;
        int in1 = 2;
        double expected = 2.0;
        double out = SqArea.square(in, in1);
        Assert.assertEquals(expected, out, 0.001);
    }
}
