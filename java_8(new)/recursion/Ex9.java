package recursion;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("a, b");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        String temp = "";
        for(int i = 0; i < a+b;i++){
            temp+="0";
        }
        two0(a,b,(int)Math.pow(2, a + b) - 1, 0, temp);
    }

    public static String reverseS2(int x, String r){

        int i = 0;
        while(x != 0){
            if(x % 2 == 1){
                r = r.substring(0, i) + "1" + r.substring(i + 1);
            }
            i++;
            x = x / 2;
        }
        return r;
    }
    public static int counterOf1(String s){
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '1'){
                res++;
            }
        }
        return res;
    }

    public static boolean check0(String temp){
        for(int i = 0; i < temp.length(); i++){
            if(temp.charAt(i) == '0'){
                if(i + 1 < temp.length() && temp.charAt(i + 1) == '0' || i - 1 >= 0 && temp.charAt(i - 1) == '0'){
                    return false;
                }
            }
        }
        return true;
    }

    public static void two0(int a, int b, int temp,int count, String r){ //всего a + b разрядов, 2 в степени (a+b) всего чисел
        if(temp == 0){
            System.out.println(count);
            return;
        }
        String s = reverseS2(temp, r);
        //System.out.println(s);
        if(counterOf1(s) == b){
            //System.out.println(s);
            if(check0(s)){
                System.out.println(s);
                two0(a,b,temp - 1,count + 1, r);
            }
            else {
                two0(a, b, temp - 1, count, r);
            }
        }
        else {
            two0(a, b, temp - 1, count, r);
        }
    }
}
