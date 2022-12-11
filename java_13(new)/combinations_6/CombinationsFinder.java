package combinations_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationsFinder {
    private String result = "";

    public void loop(List<Word> tWords, Word tmpW){
        List<Word> sBranchList = new ArrayList<>();
        List<Word> tmpList;
        List<List<Word>> wBranchList = new ArrayList<>();

        if(tWords.size() == 0){
            result = tmpW.getWord();
            return;
            // Программа заканчивается, если все слова добавлены в какую-либо цепочку
        }

        for (int i = 0; i < tWords.size(); i++){
            // Поиск цепочек по которым может пойти программа
            if (tmpW.getEndsWith() == tWords.get(i).getStartsWith()){
                sBranchList.add(new Word(tmpW.getWord() + " " + tWords.get(i).getWord()));
                tmpList = new LinkedList<>(tWords);
                tmpList.remove(i);
                wBranchList.add(tmpList);
            }
            if (tmpW.getStartsWith() == tWords.get(i).getEndsWith()){
                sBranchList.add(new Word(tWords.get(i).getWord() + " " + tmpW.getWord()));
                tmpList = new LinkedList<>(tWords);
                tmpList.remove(i);
                wBranchList.add(tmpList);
            }

        }

        for (int i = 0; i < wBranchList.size(); i++){
            // Создаются разветвления программы на все возможные цепочки слов
            loop(wBranchList.get(i), sBranchList.get(i));
        }
    }

    public String getResult() {
        return result;
    }
}
