package Lab3;

public class King extends Piece {
    King() {
        value = 1000;
    }

    @Override
    void move() {
        System.out.println("One square");
    }

    @Override
    public String toString(){
        return "King{value=‘" + value + "’}";
    }
}
