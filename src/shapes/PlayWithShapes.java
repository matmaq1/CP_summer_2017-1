package shapes;

/**
 * Created by Mateusz on 05.04.2017.
 */
public class PlayWithShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        //Shape sh1 = new Shape(3,4); error, because shape is abstract
        System.out.println(circle);

    }
}
