package Lab3;

public class Knight extends Piece {
    Knight() {
        value = 2;
    }

    @Override
    void move() {
        System.out.println("Like an L");
    }

    @Override
    public String toString(){
        return "Knight{value=‘" + value + "’}";
    }
}
