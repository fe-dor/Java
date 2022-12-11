package emarket.catalog.phones;

public class Iphone extends Phone{
    private static String[][] data = {{"IPHONE14","IPHONE13","IPHONE12"}, {"1200", "950", "860"}};
    private static String name = "iPhone";

    public  String[][] getData() {
        return data;
    }

    @Override
    public String getName() {
        return name;
    }
}

