package project;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        try{
            exception2.exceptionDemo();
        } catch (Exception e){
            System.out.println("Some error");
        } finally {
            System.out.println("End");
        }
    }
}
class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }
}
