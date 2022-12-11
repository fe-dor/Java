package mathAndRandom.formater.report;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}
