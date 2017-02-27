package com.cbs.edu.examples.cw02;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyServiceTest {

    private CompanyService companyService;

    @Before
    public void setUp() throws Exception {
        companyService = new CompanyService();
    }

    @Test
    public void countEmpsTotalSalaryTest() throws Exception {
        final int[] EMPLOYEES_SALARIES = {1000, 1500, 2000, 5000};
        final int EXPECTED = 9500;
        final int ACTUAL = companyService.countEmpsTotalSalary(EMPLOYEES_SALARIES);
        Assert.assertEquals(EXPECTED, ACTUAL);
    }
}