package Lab3;

public class Pawn extends Piece {
    boolean promoted;
    Piece newPiece;

    Pawn() {
        value = 1;
    }

    @Override
    void move() {
        System.out.println("Forward 1");
    }

    public void promote(Piece newPiece) {
        this.promoted = true;
        this.newPiece = newPiece;
    }

    @Override
    public String toString(){
        return "Pawn{value=‘" + value + "’}";
    }

    @Override
    public boolean equals(Piece piece) {
        if (!this.promoted) {
            return super.equals(piece);
        }

        return this.newPiece.value == piece.value && this.newPiece.isWhite == piece.isWhite;
    }
}
