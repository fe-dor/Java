package salary_calculation_2;

public class Browser {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setFullName("Иван Андреев");
        controller.setHoursWorked(controller.getHoursWorked() + 8);
        System.out.println("After updating: ");
        controller.updateView();

    }
    private static Employee retrieveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setFullName("Федор Паращенко");
        employee.setId("01");
        employee.setPayPerHour(400);
        return employee;
    }

}
