package Book;

public class TestBook {
    static public void main(String[] args){
        Book b1 = new Book("Мастер и Маргарита",1967,"АСТ",512,
                2016);
        b1.openPage(9);
        System.out.println(b1);
    }
}
