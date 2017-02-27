package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladimir on 27.02.2017.
 */
public class FigureTest {
    private Figure figure;

    @Before
    public void setUp() throws Exception {
        figure = new Figure("figure", 5);
    }

    @Test
    public void result() throws Exception {
        final double EXPECTED = 5;
        final double ACTUAL = figure.result();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.1);

    }

}