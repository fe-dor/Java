package mirea.java.java_30.customer_info;

import java.io.Serializable;

public final class Address implements Serializable {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLatter;
    private int apartmentNumber;
    public static final Address EMPTY_ADDRESS = new Address("", 0, "", 0, ' ', 0);

    public Address(String cityName, int zipCode, String streetName, int buildingNumber, char buildingLatter, int apartmentNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLatter = buildingLatter;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLatter() {
        return buildingLatter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
