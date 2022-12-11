package recursion;

public class Ex2 {

    public static void fromOneToN(int n){
        if(n == 1) {
            System.out.println(1);
            return;
        }
        fromOneToN(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        fromOneToN(11);
    }
}
