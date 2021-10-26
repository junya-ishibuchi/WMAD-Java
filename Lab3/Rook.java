package Lab3;

public class Rook extends Piece {
    Rook() {
        value = 5;
    }

    @Override
    void move() {
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString(){
        return "Rook{value=‘" + value + "’}";
    }
}
