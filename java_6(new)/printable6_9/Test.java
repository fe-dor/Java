package printable6_9;

public class Test {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];
        printables[0] = new Book("A Song of Ice and Fire", 2342);
        printables[1] = new Magazine("Esquire", 70);
        printables[2] = new Magazine("GQ", 35);

        for(int i = 0; i < printables.length; i++){
            printables[i].print();
        }
    }
}
