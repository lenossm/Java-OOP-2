package runners;

import figures.Rectangle;
import figures.Triangle;
import util.HelperFunctions;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8,13);
        Rectangle r2 = new Rectangle(6,19);
        Triangle t1 = new Triangle(7, 8, 9, 2.5);

        System.out.println("Rectangle 1 - Area:" + r1.getArea() + ", perimeter:" + r1.getPerimeter());
        System.out.println("Rectangle 2 - Area:" + r2.getArea() + ", perimeter:" + r2.getPerimeter());
        System.out.println("Triangle - Area: " + t1.getArea() + ", Perimeter: " + t1.getPerimeter());

        HelperFunctions.compareRectangles(r1, r2);
    }
}
