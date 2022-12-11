package sort.ex2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public static void main(String[] args) {
        Student[] students = new Student[10];
        for(int i = 0; i < students.length; i++){
            Student s = new Student();
            s.setId(i);
            s.setScore("" + (int)(Math.random() * 100) + "" + (int)(Math.random() * 10));
            students[i] = s;
        }

        quickSort(students, 0, students.length - 1);

        for(Student s : students){
            System.out.println(s.getScore());
        }
    }

    public static void quickSort(Student[] arr, int from, int to) {

        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(Student[] arr, int from, int to) { //разделение
        int rightIndex = to;
        int leftIndex = from;
        SortingStudentsByGPA ssbg = new SortingStudentsByGPA();

        Student pivot = arr[from + (to - from) / 2]; //точка опоры
        while (leftIndex <= rightIndex) {


            while (ssbg.compare(arr[leftIndex], pivot) > 0) {
                leftIndex++;
            }

            while (ssbg.compare(arr[rightIndex], pivot) < 0) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(Student[] array, int index1, int index2) {
        Student tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getScore(), o2.getScore());
    }
}
