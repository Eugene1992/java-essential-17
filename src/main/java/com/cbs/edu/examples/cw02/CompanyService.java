package com.cbs.edu.examples.cw02;

/**
 * Information about the company.
 * Created by Vladimir on 21.02.2017.
 */
public class CompanyService {

    public void a() {
        c(5);
    }

    public void b() {
        c(10);
    }

    private void c(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println();
        }
    }

    public int countEmpsTotalSalary(int... salaries) {
        int total = 0;
        for (int i = 0; i < salaries.length; i++) {
            total += salaries[i];
        }
        return total;
    }
}
