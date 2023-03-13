package model;

public class EmployeeFactory {
    private static EmployeeFactory instance;

    public static final String EMP_DE = "EMP-DE";
    public static final String EMP_DE_MANAGER = "EMP-DE-MANAGER";
    public static final String EMP_CO_PH = "EMP-CO";

    private EmployeeFactory(){

    }

    public static EmployeeFactory getInstance(){
        if(instance == null)
            instance = new EmployeeFactory();
        return instance;
    }

    public Employee generateEmployee(String code, String name, String lastName, Integer number) throws EmployeeFactoryException{
        return switch (code) {
            case "EMP-DE" -> new DependentEmployee(name, lastName, number, 1500.0);
            case "EMP-DE-MANAGER" -> new DependentEmployee(name, lastName, number, 4000.0);
            case "EMP-CO" -> new ContractEmployee(name, lastName, number, 7.0, 14.01);
            default -> throw new EmployeeFactoryException(code + " Is not a valid employee code");
        };
    }
}
