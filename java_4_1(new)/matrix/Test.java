package matrix;

public class Test {
    public static void main(String[] args) {

        int[][] a = {{1,2,3},{4,5,6},{8,9,10}};
        int[][] b = {{10,20,30},{40,50,60},{80,90,100}};

        Matrix matrixA = new Matrix(a, 3, 3);
        Matrix matrixB = new Matrix(b, 3, 3);

        matrixA.out();

        matrixA.mulByNum(2).out();

        matrixA.addition(matrixB).out();
    }

}
