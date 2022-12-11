package recursion;

public class Ex6 {

    public static void isSimple(int n, int k) {
        if(k + 2 == n){
            System.out.println("YES");
            return;
        }
        if(n % (k + 2) == 0){
            System.out.println("NO");
            return;
        }
        isSimple(n,k + 1);
    }

    public static void main(String[] args) {
        isSimple(9,0);
    }
}
