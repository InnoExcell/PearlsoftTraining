package com.pearlsoft.training;

public class EmployeeStockPlan {

    public static double grantStock (Employee stock) {
        if (stock instanceof Manager) {
            return 0.1;
        } else if (stock instanceof Admin) {
            return 0.03;
        }
        else {
            return 0.05;
        }
    }
}
