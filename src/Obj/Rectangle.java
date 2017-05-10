package Obj;

/**
 * Created by Mateusz on 05.04.2017.
 */
public class Rectangle {
    private double sideA;
    private double sideB;
    public Rectangle(double sideA, double sideB){
        setParams(sideA, sideB);
    }
    public Rectangle(){

    }
    public void setParams(double sideA, double sideB){
        //sideA = sideA;

        this.sideA = sideA; //this is the parameter for the whole object, sideA is the parameter of setParams
        this.sideB = sideB;
    }
    public double calculateSurface(){
        return sideA*sideB;

    }
}
