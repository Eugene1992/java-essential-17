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
    public void result1() throws Exception {
         parallelogram = new Parallelogram("Parallelogram", 6, 5);
    }

    @Test
    public void result() throws Exception {
        final int EXPECTED = 30;
        final int ACTUAL = 6 * 5;
        Assert.assertEquals(EXPECTED, ACTUAL);

    }

}