package work_with_strings_1;

public class Main {
    public static void main(String[] args) {
    WorkStrings workStrings = new WorkStrings();
    workStrings.setString("I like Java!!!");
    workStrings.printLastSymbol();
    workStrings.checkEndSubstring();
    workStrings.checkStartSubstring();
    workStrings.containsSubstring();
    workStrings.positionOfSubstring();
    workStrings.changeAtoB();
    workStrings.upper();
    workStrings.lower();
    System.out.println(workStrings.getSubstring(7, 10));
    }
}
