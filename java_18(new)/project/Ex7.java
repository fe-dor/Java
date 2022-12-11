package project;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        ThrowsDemo2 throwsDemo2 = new ThrowsDemo2();
        throwsDemo2.getKey();
    }
}
class ThrowsDemo2 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        try{
            printDetails( key );
        } catch (Exception e){
            System.out.println("Error");
        }
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}
