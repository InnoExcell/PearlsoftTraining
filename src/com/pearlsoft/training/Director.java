package com.pearlsoft.training;

public class Director extends Manager{
    private String carType;

    public Director (String name, int iD, double salary, String ssn, int taxId, String carType) {
        super(name, iD, salary, ssn, taxId);
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return super.toString() + carType;
    }


//    @Override
//    public String toString() {
//        return "Director{" +
//                "carType='" + carType + '\'' +
//                '}';
//    }
}
