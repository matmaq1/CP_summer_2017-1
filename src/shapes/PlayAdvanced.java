package shapes;

import java.util.Arrays;

/**
 * Created by Mateusz on 05.04.2017.
 */
public class PlayAdvanced {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(3,4);
        shapes[1] = new Circle(5);
        shapes[2] = new Square(5); // surface is 0 because we have no implementation yet
        Rectangle rect = (Rectangle)shapes[0];
        Circle circle = (Circle)shapes[1]; //circle is a pointer to casted shapes 1 they just point, creating objkect new only creates mew stuff.

        int comparison = rect.compareTo(circle);
        System.out.println("compar " + comparison);
        Arrays.sort(shapes);

        for(Shape shape:shapes){
            System.out.println(shape + "Surface = " + shape.calculateSurface());
            //
            if (shape instanceof PerimeterCalculation){ // checking if shape can be casted to PC
                PerimeterCalculation pc = (PerimeterCalculation)shape; // <- casting can be dangerous
                System.out.println("PERIMETER: " + pc.calculatePerimeter());
            }
        }
    }
}
