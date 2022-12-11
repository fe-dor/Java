package emarket.catalog.enums;

public enum Samsung {
    GALAXY_S1 (700, 1),
    MODEL_15 (630,2),
    MODEL_X (580, 3);

    private final int i;
    private final int j;

    Samsung(int i, int j) {
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
