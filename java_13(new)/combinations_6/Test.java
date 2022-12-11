package combinations_6;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        input.close();

        StringTokenizer strings = new StringTokenizer(line, " ");
        List<Word> tWords = new LinkedList<>();
        Word first = new Word(strings.nextToken().trim());
        while (strings.hasMoreTokens()) {
            tWords.add(new Word(strings.nextToken().trim()));
        }
        CombinationsFinder cf1 = new CombinationsFinder();
        cf1.loop(tWords, first);
        System.out.println(cf1.getResult());
    }
}
