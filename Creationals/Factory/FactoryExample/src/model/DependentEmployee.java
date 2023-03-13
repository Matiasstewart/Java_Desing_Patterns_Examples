package model;

public class DependentEmployee extends Employee{
    private Double monthlySalary;

    public DependentEmployee(String name, String lastName, Integer number, Double monthlySalary) {
        super(name, lastName, number);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public Double calculateSalary(Integer days) {
        return null;
    }

    @Override
    public String toString() {
        return "DependentEmployee{" +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
