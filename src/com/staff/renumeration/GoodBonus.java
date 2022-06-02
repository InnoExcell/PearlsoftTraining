package com.staff.renumeration;

import com.pearlsoft.training.*;

import java.awt.event.WindowStateListener;

public class GoodBonus {

    public static double getBonusPercent(Employee e) {

        if (e instanceof Director) {
            return 0.02;
        } else if (e instanceof Manager && e instanceof Director) {
            return 0.04;
        } else if (e instanceof Manager) {
            return 0.03;
        } else if (e instanceof Director) {
            return 0.05;
        } else if (e instanceof Engineer) {
            return 0.07;
        } else {
            return 0.01;
        }
    }
}
