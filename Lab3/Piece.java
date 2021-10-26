package Lab3;

public abstract class Piece {
    protected int value;
    protected boolean isWhite;

    Piece() {
        this.value = 0;
        this.isWhite = false;
    }

    abstract void move();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setIsWhite(boolean white) {
        isWhite = white;
    }

    public boolean equals(Piece piece) {
        return piece.value == this.value && piece.isWhite == this.isWhite;
    }
}
