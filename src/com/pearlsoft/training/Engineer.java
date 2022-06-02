package com.pearlsoft.training;

public class Engineer extends Employee{

    private int regNo;

    public Engineer (String name, int iD, double salary, String ssn, int regNo) {
        super(name, iD, salary, ssn);
        this.regNo = regNo;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

}
