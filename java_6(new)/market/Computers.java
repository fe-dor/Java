package market;

public enum Computers {
    Apple("Apple"),
    Msi("MSI"),
    Lenovo("Lenovo"),
    Asus("Asus"),
    Acer("Acer"),
    Huawei("Huawei");

    private String title;

    Computers(String title){
        this.title= title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
