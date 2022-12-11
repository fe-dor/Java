package emarket.catalog.enums;

public enum Xiaomi {
    MODEL_A1(500, 1),
    MODEL_A2 (450, 2),
    MODEL_A3 (300, 3);

    private final int i;
    private final int j;

    Xiaomi(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
