package sort.ex3;

public class Ex3 {

    public static void main(String[] args) {
        Student[] students1 = new Student[5];
        for(int i = 0; i < students1.length; i++){
            students1[i] = new Student((int)(Math.random() * 100));
        }
        Student[] students2 = new Student[7];
        for(int i = 0; i < students2.length; i++){
            students2[i] = new Student((int)(Math.random() * 100));
        }
        students1 = mergeSort(students1);
        students2 = mergeSort(students2);
        int finalLength = students1.length + students2.length;
        Student[] studentsResult = new Student[finalLength];
        merge(students1, 0,students2,0, studentsResult, 0,8);
        for(Student s : studentsResult){
            System.out.println(s.getId());
        }
        
    }

    public static Student[] mergeSort(Student[] array) {
        Student[] tmp;
        Student[] currentSrc = array;
        Student[] currentDest = new Student[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;

        }
        return currentSrc;
    }

    private static void merge(Student[] src1, int src1Start, Student[] src2, int src2Start, Student[] dest,
                              int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);


        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1].compareTo(src2[index2]) < 0)) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }
}
