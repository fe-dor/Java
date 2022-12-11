package sorting_student_2;

import java.util.Comparator;

public class LabClass implements Comparator<Student> {
    private Student[] students;


    public LabClass(Student[] students) {
        this.students = students;
    }

    public static void main(String[] args) {
        /*quickSort(students, 0, students.length - 1, 1);
        outArray(students);
        System.out.println();
        mergeSort(students, 0);
        outArray(students);
        System.out.println();
        */
    }


    //Быстрая сортировка
    public void quickSort(Student[] arr, int from, int to, int whichField) {

        if (from < to) {

            int divideIndex = partition(arr, from, to, whichField);

            quickSort(arr, from, divideIndex - 1, whichField);

            quickSort(arr, divideIndex, to, whichField);
        }
    }
    private int partition(Student[] arr, int from, int to, int whichField) {
        int rightIndex = to;
        int leftIndex = from;

        Student pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {


            while (this.compare(arr[leftIndex], pivot, whichField) > 0) {
                leftIndex++;
            }

            while (this.compare(arr[rightIndex], pivot, whichField) < 0) {
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
    private void swap(Student[] array, int index1, int index2) {
        Student tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }


    //Сортировка слиянием
    public Student[] mergeSort(Student[] array, int whichField) {
        Student[] tmp;
        Student[] currentSrc = array;
        Student[] currentDest = new Student[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size, whichField);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;

        }
        return currentSrc;
    }
    public void merge(Student[] src1, int src1Start, Student[] src2, int src2Start, Student[] dest,
                              int destStart, int size, int whichField) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);


        int iterationCount = src1End - src1Start + src2End - src2Start;


        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || this.compare(src1[index1], src2[index2], whichField) > 0)) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }

    public void outArray(Student[] students){
        for(Student s : students){
            System.out.println("ID: " + s.getiDNumber() + " GPA: " + s.getGPA());
        }
    }

    public String outArrayString(Student[] students){
        StringBuilder sb = new StringBuilder();
        for(Student s : students){
            sb.append("ID: " + s.getiDNumber() + " GPA: " + s.getGPA() + "\n");
        }
        return sb.toString();
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGPA(), o2.getGPA()); //Сравниванием поля Double
    }

    public int compare(Student o1, Student o2, int whichField) {
        if (whichField == 1){
            return Integer.compare(o1.getiDNumber(), o2.getiDNumber());
        }
        return Double.compare(o1.getGPA(), o2.getGPA());
    }

    public Student find(String id) throws StudentNotFoundException, EmptyStringException {
        if(id.isEmpty())
            throw new EmptyStringException();
        for(Student student : students){
            if(student.getiDNumber() == Integer.parseInt(id))
                return student;
        }
        throw new StudentNotFoundException();
    }

    public Student[] getStudents() {
        return students;
    }
}
