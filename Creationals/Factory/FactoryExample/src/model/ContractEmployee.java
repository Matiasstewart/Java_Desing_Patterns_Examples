package model;

public class ContractEmployee extends Employee{
    private Double pricePerHour;
    private Double taxes;

    public ContractEmployee(String name, String lastName, Integer number, Double pricePerHour, Double taxes) {
        super(name, lastName, number);
        this.pricePerHour = pricePerHour;
        this.taxes = taxes;
    }

    public ContractEmployee(Double pricePerHour, Double taxes) {
        this.pricePerHour = pricePerHour;
        this.taxes = taxes;
    }

    @Override
    public Double calculateSalary(Integer days) {
        return null;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "pricePerHour=" + pricePerHour +
                ", taxes=" + taxes +
                '}';
    }
}
