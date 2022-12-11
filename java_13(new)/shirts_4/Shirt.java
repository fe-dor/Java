package shirts_4;

public class Shirt {
    private String orderId;
    private String name;
    private String color;
    private String size;

    public Shirt(String orderId, String name, String color, String size) {
        this.orderId = orderId;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "orderId='" + orderId + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
