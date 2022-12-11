package salary_calculation_2;

public class EmployeeView {
    public void printInfoAboutEmployee(String fullName,
                                   String id, int hoursWorked, double salary){
        System.out.println("Information about employee: ");
        System.out.println("Name: " + fullName);
        System.out.println("Employee ID: " + id);
        System.out.println("Hours worked in this month: " + hoursWorked);
        System.out.println("Salary: " + salary);
    }
}
