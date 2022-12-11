package adress_3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String building;
    private String extension;
    private String apartment;

    public Address() {
    }

    public void getStringComas(String s){
        String[] address = s.split(",");
        country = address[0];
        region = address[1];
        city = address[2];
        street = address[3];
        building = address[4];
        extension = address[5];
        apartment = address[6];
    }

    public void getStringSymbols(String s){
        String[] address = new String[7];
        StringTokenizer st = new StringTokenizer(s, ",.;");
        int i = 0;
        while (st.hasMoreTokens()){
            address[i] = st.nextToken();
            i++;
        }
        country = address[0];
        region = address[1];
        city = address[2];
        street = address[3];
        building = address[4];
        extension = address[5];
        apartment = address[6];
    }

    public void getFields(){
        System.out.println(country);
        System.out.println(region);
        System.out.println(city);
        System.out.println(street);
        System.out.println(building);
        System.out.println(extension);
        System.out.println(apartment);
    }
}
