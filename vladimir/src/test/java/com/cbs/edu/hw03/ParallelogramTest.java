package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladimir on 27.02.2017.
 */
public class ParallelogramTest {
    private Parallelogram parallelogram;

    @Before
    public void setUp() throws Exception {
        parallelogram = new Parallelogram("Parallelogram", 6, 5);
    }

    @Test
    public void result() throws Exception {
        final double EXPECTED = 30;
        final double ACTUAL = parallelogram.result();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.1);

    }

}