package work_with_strings_1;

public class WorkStrings {
    private String s;

    public void setString(String s){
        this.s = s;
    }

    public void printLastSymbol(){
        System.out.println(s.charAt(s.length() - 1));
    }

    public void checkEndSubstring(){
        if(s.endsWith("!!!"))
            System.out.println("String '" + s + "' ends with '!!!'");
        else
            System.out.println("String '" + s + "' doesn't ends with '!!!'");
    }

    public void checkStartSubstring(){
        if(s.startsWith("I like"))
            System.out.println("String '" + s + "' starts with 'I like'");
        else
            System.out.println("String '" + s + "' doesn't starts with 'I like'");
    }

    public void containsSubstring(){
        if(s.contains("Java"))
            System.out.println("String '" + s + "' contains 'Java'");
        else
            System.out.println("String '" + s + "' doesn't contains 'Java'");
    }

    public void positionOfSubstring(){
        if(s.contains("Java"))
            System.out.println("Substring 'Java' is starts on " + s.indexOf("Java") + " position");
        else
            System.out.println("String '" + s + "' doesn't contains 'Java'");
    }

    public void changeAtoB(){
        StringBuilder stringBuilder = new StringBuilder(s);
        char ch;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == 'a')
                stringBuilder.setCharAt(i,'o');
        }
        System.out.println(stringBuilder);
    }

    public void upper(){
        System.out.println(s.toUpperCase());
    }

    public void lower(){
        System.out.println(s.toLowerCase());
    }

    public String getSubstring(int a, int b){
        return (s.substring(a, b + 1));
    }
}
