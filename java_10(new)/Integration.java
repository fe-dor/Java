public class Integration {
    public static Student[] integration(Student[] students1,  Student[] students2){
        students1 = SortingStudentsByGPA.mergeSort(students1, 0);
        students2 = SortingStudentsByGPA.mergeSort(students2, 0);
        int finalLength = students1.length + students2.length;
        Student[] studentsResult = new Student[finalLength];
        SortingStudentsByGPA.merge(students1, 0,students2,0, studentsResult, 0,16, 0);
        return studentsResult;
    }
}
