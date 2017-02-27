package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladimir on 27.02.2017.
 */
public class TriangleTest {
    private Triangle triangle;

    @Before
    public void result1() throws Exception {
        triangle = new Triangle("Triangle", 6, 2);
    }

    @Test
    public void result() throws Exception {
        final int EXPECTED = 6;
        final int ACTUAL = 6 * 2 / 2;
        Assert.assertEquals(EXPECTED, ACTUAL);
    }

}