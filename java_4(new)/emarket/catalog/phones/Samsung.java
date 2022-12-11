package emarket.catalog.phones;

public class Samsung extends Phone{
    private static String[][] data = {{"GALAXY_S1","MODEL_15","MODEL_X"}, {"700", "630", "580"}};
    private static String name = "Samsung";

    public String[][] getData() {
        return data;
    }

    @Override
    public String getName() {
        return name;
    }
}
