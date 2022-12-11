package sort.ex1;

public class Ex1 {

    public static void insertionSort(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            Comparable current = array[i];
            int j = i;
            while (j > 0 && array[j - 1].compareTo(current) > 0) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }

    public static void main(String[] args) {
        Student[] sArray = new Student[10];
        for(int i = 0; i < 10; i++) {
            sArray[i] = new Student((int)(Math.random() * 100));
        }
        insertionSort(sArray);
        for(int i = 0; i < 10; i++) {
            System.out.println(sArray[i].iDNumber);
        }
    }
}

class Student implements Comparable<Student>{

    protected int iDNumber;

    Student(int iDNumber){
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(Student o) {
        if(o.iDNumber == this.iDNumber)
            return 0;
        if (this.iDNumber > o.iDNumber)
            return 1;
        return -1;
    }
}
