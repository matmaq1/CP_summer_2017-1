package shapes;
import java.math.*;


/**
 * Created by Mateusz on 05.04.2017.
 */
public class Circle extends Shape implements PerimeterCalculation {
    public Circle(double radius){
        super(radius, 0); //optimizing

    }
    @Override
    public double calculatePerimeter(){
        return 2*Math.PI*parA;

    }
    public double calculateSurface()
    {
        double radius = parA;
        double pi = Math.PI;
        return Math.pow(radius, 2)*pi;
    }

}
