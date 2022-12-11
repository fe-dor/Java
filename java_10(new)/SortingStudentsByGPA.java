import java.util.Comparator;

public class SortingStudentsByGPA  implements Comparator<Student> {

    public static void setArray(Student[] students){
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student((int)(Math.random() * 100), Math.random() * 5);
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        setArray(students);
        quickSort(students, 0, students.length - 1, 1);
        outArray(students);
        System.out.println();
        mergeSort(students, 0);
        outArray(students);
        System.out.println();

        Student[] students1 = new Student[4];
        setArray(students1);
        outArray(students1);
        System.out.println();
        mergeSort(students1, 0);
        outArray(students1);
        System.out.println();

        Student[] studentsResult = Integration.integration(students1, students);
        outArray(studentsResult);
    }


    //Быстрая сортировка
    public static void quickSort(Student[] arr, int from, int to, int whichField) {

        if (from < to) {

            int divideIndex = partition(arr, from, to, whichField);

            quickSort(arr, from, divideIndex - 1, whichField);

            quickSort(arr, divideIndex, to, whichField);
        }
    }
    private static int partition(Student[] arr, int from, int to, int whichField) {
        int rightIndex = to;
        int leftIndex = from;
        SortingStudentsByGPA ssbg = new SortingStudentsByGPA();

        Student pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {


            while (ssbg.compare(arr[leftIndex], pivot, whichField) > 0) {
                leftIndex++;
            }

            while (ssbg.compare(arr[rightIndex], pivot, whichField) < 0) {
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


    //Сортировка слиянием
    public static Student[] mergeSort(Student[] array, int whichField) {
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
    public static void merge(Student[] src1, int src1Start, Student[] src2, int src2Start, Student[] dest,
                              int destStart, int size, int whichField) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);


        int iterationCount = src1End - src1Start + src2End - src2Start;

        SortingStudentsByGPA ssbg = new SortingStudentsByGPA();

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || ssbg.compare(src1[index1], src2[index2], whichField) > 0)) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }

    public static void outArray(Student[] students){
        for(Student s : students){
            System.out.println("ID: " + s.getiDNumber() + " GPA: " + s.getGPA());
        }
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

}
