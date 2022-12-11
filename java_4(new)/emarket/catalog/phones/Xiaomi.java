package emarket.catalog.phones;

public class Xiaomi extends Phone{
    private static String[][] data = {{"MODEL_A1","MODEL_A2","MODEL_A3"}, {"500", "450", "300"}};
    private static String name = "Xiaomi";

    public String[][] getData() {
        return data;
    }

    @Override
    public String getName() {
        return name;
    }
}
