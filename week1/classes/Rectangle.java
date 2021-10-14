package week1.classes;

public class Rectangle {
    private final int width;
    private final int height;
    private final String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.color.charAt(0));
            }
            System.out.println();
        }
    }
}
