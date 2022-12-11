package project;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        try{
            exception2.exceptionDemo();
        } catch (NumberFormatException e){
            System.out.println("Incorrect format");
        } catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
    }
}
class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }
}
