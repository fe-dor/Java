package strings;

public class StringOperations implements WorkStrings{

    @Override
    public int countOfSymbols(String s) {
        int res = 0;
        boolean w = true;
        while(w) {
            res++;
            s = s.substring(1);
            w = !s.equals("");
        }
        return res;
    }

    @Override
    public String oddSymbols(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < this.countOfSymbols(s); i+=2){
            res.append(s.charAt(i));
        }
        return String.valueOf(res);
    }

    @Override
    public String invertString(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = this.countOfSymbols(s) - 1; i >= 0; i--){
            res.append(s.charAt(i));
        }
        return String.valueOf(res);
    }
}
