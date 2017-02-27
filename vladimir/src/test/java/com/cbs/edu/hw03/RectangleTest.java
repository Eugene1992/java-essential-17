package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladimir on 27.02.2017.
 */
public class RectangleTest {
    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle("Recatangle", 7, 9);
    }

    @Test
    public void result() throws Exception {
        final double EXPECTED = 63;
        final double ACTUAL = rectangle.result();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.1);

    }

}