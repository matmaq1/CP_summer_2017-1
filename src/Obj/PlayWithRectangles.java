package Obj;

/**
 * Created by Mateusz on 05.04.2017.
 */
public class PlayWithRectangles {
    public static void main(String[] args) {
        Rectangle rectum = new Rectangle(42,42);

       //private rectum.sideA = 33;
        System.out.println(rectum.calculateSurface());
        Rectangle r2 = new Rectangle();
        r2.setParams(3,3);
        System.out.println(r2.calculateSurface());
      //  Rectangle[3] r3 = new Rectangle[3];



    }
}
