package com.pearlsoft.training;

public class Manager extends Employee {

    private int taxId;

    public Manager(String name, int iD, double salary, String ssn, int taxId) {
        super(name, iD, salary, ssn);
        this.taxId = taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public int getTaxId() {
        return taxId;
    }

    @Override
    public String toString() {
        return super.toString() + taxId;
    }


}
