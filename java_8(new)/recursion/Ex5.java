package recursion;

public class Ex5 {

    public static int sum(int num){
        if(num == 0)
            return 0;
        return num%10 + sum(num/10);
    }

    public static void main(String[] args) {
        System.out.println(sum(12345));
    }

}
