package com.pearlsoft.training;

import java.util.EnumMap;

public class Employee {

    private String name;
    private int iD;
    private double salary;
    private String ssn;

    public Employee(String name, int iD, double salary, String ssn) {
        this.name = name;
        this.iD = iD;
        this.salary = salary;
        this.ssn = ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setiD(int iD, String name) {
        this.iD = iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getiD() {
        return iD;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSsn() {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public String toString() {
        return (name + " " + iD + " " + salary + " " + ssn);
    }

    @Override
    public boolean equals (Object o) {
        boolean result = false;
        if ((this.name == ((Employee)o).name) && (this.iD == ((Employee)o).iD) && (this.salary == ((Employee)o).salary) && (this.ssn == ((Employee)o).ssn)) {
            result = true;
        }
        return result;
    }

}
