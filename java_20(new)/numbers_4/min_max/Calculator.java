package numbers_4.min_max;

public class Calculator {
    public static <T extends Number, K extends Number> double sum(T n1, K n2){
        double d1 = Double.parseDouble(String.valueOf(n1));
        double d2 = Double.parseDouble(String.valueOf(n2));
        return d1 + d2;
    }
    public static <T extends Number, K extends Number> double multiply(T n1, K n2){
        double d1 = Double.parseDouble(String.valueOf(n1));
        double d2 = Double.parseDouble(String.valueOf(n2));
        return d1 * d2;
    }
    public static <T extends Number, K extends Number> double divide(T n1, K n2){
        double d1 = Double.parseDouble(String.valueOf(n1));
        double d2 = Double.parseDouble(String.valueOf(n2));
        return d1 / d2;
    }

    public static <T extends Number, K extends Number> double subtraction(T n1, K n2){
        double d1 = Double.parseDouble(String.valueOf(n1));
        double d2 = Double.parseDouble(String.valueOf(n2));
        return d1 - d2;
    }


    public static void main(String[] args) {
        System.out.println(Calculator.sum(3.3f, 3366660L));
        System.out.println(Calculator.multiply(3.3f, 3L));
        System.out.println(Calculator.divide(3.3f, 1L));
        double v = 0.3333333;
        System.out.println(Calculator.subtraction(new Integer(600), v));
    }
}