package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladimir on 27.02.2017.
 */
public class RhombusTest {
    private Rhombus rhombus;

    @Before
    public void setUp() throws Exception {
        rhombus = new Rhombus("Rhombus", 6, 3);
    }

    @Test
    public void result() throws Exception {
        final double EXPECTED = 18;
        final double ACTUAL = rhombus.result();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.1);
    }

}