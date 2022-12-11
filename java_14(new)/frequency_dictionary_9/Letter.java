package frequency_dictionary_9;

import java.util.Comparator;

public class Letter implements Comparable<Letter> {
    private final char letter;
    private int count;

    public Letter(char letter) {
        this.letter = letter;
        this.count = 1;
    }

    public void countUp(){
        count++;
    }

    public char getLetter() {
        return letter;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(Letter o) {
        if(this.getCount() > o.getCount())
            return 1;
        else
            return 0;
    }
}
