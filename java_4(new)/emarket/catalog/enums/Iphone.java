package emarket.catalog.enums;

public enum Iphone {
    IPHONE14(1200,1),
    IPHONE13(950,2),
    IPHONE12(860,3);

    private final int i;
    private final int j;

    Iphone(int i, int j) {
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
