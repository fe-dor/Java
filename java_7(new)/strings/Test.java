package strings;

public class Test {
    public static void main(String[] args) {
        WorkStrings workStrings = new StringOperations();
        int n = workStrings.countOfSymbols("hello");
        System.out.println(n);
        System.out.println(workStrings.oddSymbols("hello"));
        System.out.println(workStrings.invertString("hello"));
    }


}
