package sorting_student_2;

public class LabClassDriver {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        setArray(students);
        LabClass sortingStudentsByGPA = new LabClass(students);
        new LabClassUI(sortingStudentsByGPA);
    }
    public static void setArray(Student[] students){
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student((int)(Math.random() * 100), Math.random() * 5);
        }
    }
}
