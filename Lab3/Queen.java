package Lab3;

public class Queen extends Piece {
    Queen() {
        value = 9;
    }

    @Override
    void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString(){
        return "Queen{value=‘" + value + "’}";
    }
}
