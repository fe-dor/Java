package sorting_student_2;

public class Student {
    private String name;
    private String surname;
    private String speciality;
    private int course;
    private String group;
    private int iDNumber;
    private double GPA;

    public Student(String name, String surname, String speciality, int course, String group, int iDNumber, double GPA) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public Student(int iDNumber, double GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }


    @Override
    public String toString() {
        return "Student{" + "iDNumber=" + iDNumber +
                ", GPA=" + GPA +
                '}';
    }
}
