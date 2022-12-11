package mathAndRandom.first;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        double[] a = new double[10];
        for (int i = 0; i < 5; i++){
            a[i] = Math.random();
        }
        Random rand = new Random();
        for (int i = 5; i < 10; i++){
            a[i] = rand.nextDouble();
        }
        for (double d : a){
            System.out.println(d);
        }
        System.out.println();
        Arrays.sort(a);
        for (double d : a){
            System.out.println(d);
        }
    }
}
