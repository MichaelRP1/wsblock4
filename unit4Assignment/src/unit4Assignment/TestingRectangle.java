package unit4Assignment;

import unit4Assignment.Rectangle;

public class TestingRectangle {
    public static void main(String[] args) throws Exception {
        Rectangle rec = new Rectangle(3, 4, "blue", true);
        System.out.println(rec.toString());
        System.out.println("Diagonal Length = " + rec.getDiagonal());
    }
}
