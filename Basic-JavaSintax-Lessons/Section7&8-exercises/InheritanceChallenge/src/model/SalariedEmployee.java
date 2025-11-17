package model;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public void retire(){
        terminate(getEndDate());
        isRetired = true;
        System.out.println("Retired with success!");
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name: " + getName() +
                "\nBirth date: " + getBirthDate() +
                "\nHire date: " + getHireDate() +
                "\nannualSalary: " + annualSalary +
                "\nisRetired: " + isRetired +
                (isRetired ? "\nEnd Date: " + getEndDate() : "") +
                '}';
    }
}
