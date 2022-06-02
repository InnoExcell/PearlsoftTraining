package com.pearlsoft.training;

public class Admin extends Employee{
    private String title;

    public Admin(String name, int iD, double salary, String ssn, String title) {
        super(name, iD, salary, ssn);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
