package com.pearlsoft.training;

import com.staff.renumeration.DbConfigSingleton;
import com.staff.renumeration.GoodBonus;

import java.lang.String;

import java.util.Arrays;

public class Test {

    public static void main(String... args) {
        String name = "Innocent";
        int iD = 452;
        double salary = 0;
        String ssn = "10234824";
        int taxId = 345;
        String carType = "Mustang";
        int regNo = 0;

        Employee executiveEmp = new Employee(name, iD, salary, ssn);
        System.out.println("The employee's name is: " + executiveEmp.getName() +", ID no is: " + executiveEmp.getiD() + ", salary is: " + executiveEmp.getSalary() );

        Manager executiveMgr = new Manager(name, iD, salary, ssn, taxId);
        executiveMgr.setTaxId(1967);
        executiveMgr.setName("Inno");
        // System.out.println("The Manager's taxId is: " + executiveMgr.getTaxId());
        // System.out.println("The Manager's name is: " + executiveMgr.getName());

        Director executiveDir = new Director(name, iD, salary, ssn, taxId, carType);

        Engineer executiveEng = new Engineer(name, iD, salary, ssn, regNo);


        executiveDir.setTaxId(874);
        executiveDir.setName("Ayo");
        executiveDir.setSalary(50000.67);
        executiveDir.setiD(50);
        executiveDir.setCarType("Rolls Royce");


        // System.out.println("The Director's tax id is: " + executiveDir.getTaxId() + "\n" +
               // "His name is " + executiveDir.getName() + "His salary is : " + executiveDir.getSalary());

//
//        System.out.println(GoodBonus.getBonusPercent(executiveMgr));
//        System.out.println(GoodBonus.getBonusPercent(executiveEng));
//        System.out.println(GoodBonus.getBonusPercent(executiveDir));

        Employee newEmployee = new Employee(name = "Oyin", iD = 014, salary = 784.98, ssn = "Intern");
        Employee oldEmployee = new Employee(name = "Innocent", iD = 014, salary = 784.98, ssn = "Intern");

        // System.out.println(newEmployee);
        // System.out.println(newEmployee.equals(oldEmployee));

        // DbConfigSingleton dbConfig = new DbConfigSingleton();
        DbConfigSingleton instance = DbConfigSingleton.getInstance();
        instance.getDatabaseConnection();
        //System.out.println(instance.getDatabaseConnection());

        EmployeeStockPlan stockPlan = new EmployeeStockPlan();

        System.out.println(stockPlan.grantStock(executiveEng));

//        Employee bestEmployee = new Director(name = "Ayooluwa", iD = 1001, salary = 50000, ssn = "good_guy", taxId = 432, carType = "Ford");
//
//        System.out.println(bestEmployee);
//
//        Director bestDirector = (Director) new Employee(name = "Oluwaseyi", iD = 2002, salary = 400000, ssn = "great_guy");


    }
}
