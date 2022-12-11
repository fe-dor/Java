package frequency_dictionary_9;

import java.util.ArrayList;
import java.util.Locale;

public class Dictionary {
    private ArrayList<Letter> letters;

    public Dictionary(String string){
        Letter temp = null;
        letters = new ArrayList<>();
        string = string.toLowerCase();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(int i = string.length() - 1; i >=0; i--){ //Оставляем в строке только буквы
            if(string.charAt(i) <= 122 && string.charAt(i) >= 97)
                sb.append(string.charAt(i));
        }
        while(!sb.isEmpty()){//добавляем каждый символ в массив букв, у каждой буквы есть поле кол-во, увеличиваем его,
                            // если буква уже встречаалсь
            flag = true;
            for(int i = letters.size() - 1; i >=0; i--){
                if(letters.get(i).getLetter() == sb.charAt(0)){
                    letters.get(i).countUp();
                    sb.deleteCharAt(0);
                    flag = false;
                    break;
                }
            }
            if(flag) {
                temp = new Letter(sb.charAt(0));
                sb.deleteCharAt(0);
                letters.add(temp);
            }
        }
    }

    public void sort() {
        for (int i = 0; i < letters.size() - 1; i++) {
            for (int j = letters.size() - 1; j > i; j--) {
                if (letters.get(j - 1).compareTo(letters.get(j)) < 1) {
                    Letter tmp = letters.get(j - 1);
                    letters.set(j - 1, letters.get(j));
                    letters.set(j, tmp);
                }
            }
        }
    }

    public void out(){
        for(Letter l : letters){
            System.out.println(l.getLetter() + " " + l.getCount());
        }
    }
}
