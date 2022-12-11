package calculator;

import java.util.Stack;

public class Model {
    private String expression;
    private Stack<Double> elements;
    private Stack<String> inficksElemnts;
    private boolean flag;

    public void calculations() throws WrongExpressionException {
        elements = new Stack<>();
        inficksElemnts = new Stack<>();
        char tempSymbol;
        StringBuilder newDigit = new StringBuilder();
        int n = expression.length();
        for(int i = 0 ; i < n; i++){
            tempSymbol = expression.charAt(i);
            if((tempSymbol <= 57 && tempSymbol >= 48) || (tempSymbol == '.' && !newDigit.isEmpty())){
                newDigit.append(tempSymbol);
            }
            else{
                if(!newDigit.isEmpty()){
                    elements.push(Double.parseDouble(newDigit.toString()));
                    inficksElemnts.push(newDigit.toString());
                    newDigit.delete(0, newDigit.length());
                }
                if(tempSymbol == '+' || tempSymbol == '-' || tempSymbol == '/' || tempSymbol == '*'){
                    operation(tempSymbol);
                }
            }
        }
    }

    public void operation(char operation) throws WrongExpressionException {
        flag = true;
        if(elements.size() < 2)
            throw new WrongExpressionException();
        else{
            double b = elements.pop();
            double a = elements.pop();
            String bS = inficksElemnts.pop();
            String aS = inficksElemnts.pop();
            switch (operation) {
                case ('+') -> {
                    elements.push(a + b);
                    inficksElemnts.push("(" + aS + "+" + bS + ")");
                }
                case ('-') -> {
                    elements.push(a - b);
                    inficksElemnts.push("(" + aS + "-" + bS + ")");
                }
                case ('/') -> {
                    elements.push(a / b);
                    inficksElemnts.push(aS + "/" + bS);
                }
                case ('*') -> {
                    elements.push(a * b);
                    inficksElemnts.push(aS + "*" + bS);
                }
            }
        }
    }

    public Double getResult() throws WrongExpressionException {
        return elements.peek();
    }

    public String getInficksForm() throws WrongExpressionException {
        if(elements.size() != 1 || !flag)
            throw new WrongExpressionException();
        String out = inficksElemnts.peek();
        if(out.charAt(0) == '('){
            out = out.substring(1, out.length() - 1);
        }
        return out + "=" + getResult();
    }

    public void setExpression(String expression) {
        this.expression = expression.trim();
    }

    private void checkExpression(){

    }
}
