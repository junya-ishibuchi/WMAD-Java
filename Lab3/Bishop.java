package Lab3;

public class Bishop extends Piece {
    Bishop() {
        value = 3;
    }

    @Override
    void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString(){
        return "Bishop{value=‘" + value + "’}";
    }
}
