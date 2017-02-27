package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladimir on 27.02.2017.
 */
public class TrapezeTest {
    private Trapeze trapeze;

    @Before
    public void setUp() throws Exception {
        trapeze = new Trapeze("Trapeze", 8, 9, 7);
    }

    @Test
    public void result() throws Exception {
        final double EXPECTED = 59.5;
        final double ACTUAL = trapeze.result();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.1);
    }

}