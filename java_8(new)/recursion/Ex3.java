package recursion;

public class Ex3 {

    public static void fromAToB(int a, int b){
        System.out.println(a);
        if(a == b)
            return;
        if(a < b)
            fromAToB(a + 1, b);
        else
            fromAToB(a - 1, b);
    }

    public static void main(String[] args) {
        fromAToB(45, 51);
    }
}
