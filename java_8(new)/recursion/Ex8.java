package recursion;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check(sc.nextLine());
        sc.close();
    }
    public static void check(String p){
        if(p.length() < 2){
            System.out.println("YES");
            return;
        }
        if(p.charAt(0) != p.charAt(p.length() - 1)){
            System.out.println("NO");
            return;
        }
        check(p.substring(1, p.length() - 1));
    }

}
