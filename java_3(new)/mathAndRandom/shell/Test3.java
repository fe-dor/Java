package mathAndRandom.shell;

import static java.lang.Double.valueOf;

public class Test3 {
    public static void main(String[] args) {
        Double a1 = valueOf("3.12");
        Double a2 = valueOf("3.23");
        Double a3 = valueOf("3.85");

        double b1 = Double.parseDouble("5.33");
        double b2 = Double.parseDouble("8.43");
        double b3 = Double.parseDouble("7.94");

        int i = a1.intValue();
        System.out.println(i);
        long l = a1.longValue();
        System.out.println(l);
        short s = a1.shortValue();
        System.out.println(s);
        byte b = a1.byteValue();
        System.out.println(b);

        String d = Double.toString(b1);
        System.out.println(d);
    }
}
