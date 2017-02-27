package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladimir on 27.02.2017.
 */
public class SquareTest {
    private Square square;

    @Before
    public void setUp() throws Exception {
        square = new Square("Square", 5);
    }

    @Test
    public void resultTest() throws Exception {
        final double EXPECTED = 25;
        final double ACTUAL = square.result();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.1);
    }

}