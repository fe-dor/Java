package matrix;

public class Matrix {
    private int m[][];
    private int lines;
    private int columns;

    public Matrix(int[][] m, int lines, int columns) {
        this.m = m;
        this.lines = lines;
        this.columns = columns;
    }

    public Matrix addition(Matrix matrix){
        if(matrix.lines == this.lines && matrix.columns == this.columns){
            int[][] temp = new int[lines][columns];
            for(int i = 0; i < lines; i++){
                for(int j = 0; j < columns; j++){
                    temp[i][j] = m[i][j] + matrix.m[i][j];
                }
            }
            return new Matrix(temp, lines, columns);
        }
        return null;
    }

    public Matrix mulByNum(int x){
        int[][] temp = new int[lines][columns];
        for(int i = 0; i < lines; i++){
            for(int j = 0; j < columns; j++){
                temp[i][j] = m[i][j] * x;
            }
        }
        return new Matrix(temp, lines, columns);
    }

    public void out(){
        for(int i = 0; i < lines; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
