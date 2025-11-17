package model;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate,
                          double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name: " + getName() +
                "\nBirth date: " + getBirthDate() +
                "\nHire date: " + getHireDate() +
                "\nhourlyPayRate: " + hourlyPayRate +
                '}';
    }
}
