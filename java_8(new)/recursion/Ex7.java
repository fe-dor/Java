package recursion;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        simple(n, 2);
    }
    public static void simple(int n, int div){
        if(n < 2){
            return;
        }
        if(n % div == 0){
            System.out.print(div + " ");
            n = n / div;
        }
        else{
            div++;
        }
        simple(n, div);
    }
}
