package shapes;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Mateusz on 05.04.2017.
 */

public class Rectangle extends Shape implements PerimeterCalculation{

    public Rectangle(double parA, double parB){
        super(parA, parB);
    }
    public double calculatePerimeter(){
        return 2*parA+2*parB;

    }
    public double calculateSurface(){
        return parA*parB; //bcz protected
    }



}
