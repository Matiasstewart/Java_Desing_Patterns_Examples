import model.Employee;
import model.EmployeeFactory;
import model.EmployeeFactoryException;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = EmployeeFactory.getInstance();
        EmployeeFactory employeeFactory2 = EmployeeFactory.getInstance();

        //Singleton factory check
        System.out.println(employeeFactory.equals(employeeFactory2));

        try{
            Employee employee = employeeFactory.generateEmployee(EmployeeFactory.EMP_DE,"Fred","Jackson",123456);
            System.out.println(employee.getName() +" "+ employee.getLastName());
            System.out.println(employee);

            Employee employeeManager = employeeFactory2.generateEmployee(EmployeeFactory.EMP_DE_MANAGER,"Michael", "Garcia",243567);
            System.out.println(employeeManager.getName() +" "+ employeeManager.getLastName());
            System.out.println(employeeManager);

            Employee employeeContract = employeeFactory.generateEmployee(EmployeeFactory.EMP_CO_PH, "Jack","Sparrow",124563);
            System.out.println(employeeContract.getName() +" "+ employeeContract.getLastName());
            System.out.println(employeeContract);

            Employee employeeError = employeeFactory2.generateEmployee("ABS-123", "Muhammad", "Ali", 172839);
            System.out.println(employeeError.getName() +" "+ employeeError.getLastName());
            System.out.println(employeeError);

        } catch (EmployeeFactoryException e){
            e.printStackTrace();
        }

    }
}
