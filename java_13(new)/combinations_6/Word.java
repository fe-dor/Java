package combinations_6;

import java.util.Locale;

public class Word {
    private char startsWith;
    private char endsWith;
    private String word;

    public Word(String word){
        this.startsWith = word.toLowerCase(Locale.ROOT).charAt(0);
        this.endsWith = word.toLowerCase(Locale.ROOT).charAt(word.length() - 1);
        this.word = word;
    }

    public char getStartsWith() {
        return startsWith;
    }

    public void setStartsWith(char startsWith) {
        this.startsWith = startsWith;
    }

    public char getEndsWith() {
        return endsWith;
    }

    public void setEndsWith(char endsWith) {
        this.endsWith = endsWith;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
