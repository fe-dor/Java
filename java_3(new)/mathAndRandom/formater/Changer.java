package mathAndRandom.formater;

public class Changer {

    private static double yaun = 8.55;
    private static double dollar = 61.20;
    private static double euro = 60.68;
    private static double belrub = 24.24;

    public static double convert(double r, String v){
        if(v == "yuan"){
            return r/yaun;
        }
        if(v == "belrub"){
            return r/belrub;
        }
        if(v == "euro"){
            return r/euro;
        }
        if(v == "dollar"){
            return r/dollar;
        }
        else{
            System.out.println("error");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Changer.convert(570, "belrub"));
    }
}
