package project;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        ThrowsDemo3 throwsDemo3 = new ThrowsDemo3();
        throwsDemo3.getKey();
    }
}
class ThrowsDemo3 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in);
        for(int i = 0; i < 2; i++) {
            String key = myScanner.next();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Error");
            }
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
        if(key.equals(".") || key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}

