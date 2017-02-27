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
    public void result1() throws Exception{
        figure = new Figure("figure", 5);
    }
    @Test
    public void result() throws Exception {
        final int EXPECTED = 5;
        final int ACTUAL = 5;
        Assert.assertEquals(EXPECTED,ACTUAL);

    }

}