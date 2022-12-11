package salary_calculation_2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }

    public void setFullName(String name){
        model.setFullName(name);
    }

    public void setId(String id){
        model.setId(id);
    }

    public void setPayPerHour(double payPerHour){
        model.setPayPerHour(payPerHour);
    }

    public void setHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }

    public String getFullName(){
        return model.getFullName();
    }

    public String getCourseId(){
        return model.getId();
    }

    public double getPayPerHour(){
        return model.getPayPerHour();
    }

    public int getHoursWorked(){
        return model.getHoursWorked();
    }

    public void updateView(){
        view.printInfoAboutEmployee(model.getFullName(),
                model.getId(), model.getHoursWorked(), model.getSalary());
    }



}
