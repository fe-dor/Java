package emarket;

import emarket.catalog.phones.Phone;

public class Product {
    private Phone phone;
    private int model;

    public Product(Phone phone, int model) {
        this.phone = phone;
        this.model = model;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone { " +
                "company : " + phone.getName() +
                ", model : " + phone.getData()[0][model] +
                " }";
    }
}
