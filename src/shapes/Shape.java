package shapes;

/**
 * Created by Mateusz on 05.04.2017.
 */
public abstract class Shape implements Comparable<Shape>  { //generic implementation
    protected double parA;
    protected double parB;


    public Shape(double parA, double parB){
        setParams(parA, parB);
    }


    public void setParams(double parA,double parB){
        this.parA = parA;
        this.parB = parB;
    }
    public abstract double calculateSurface();

    @Override
    public int compareTo(Shape shape) {
        Double mySurface = Double.valueOf(this.calculateSurface());//DOuble.valueOf(calculateSurface());
        Double otherSurface = Double.valueOf(shape.calculateSurface());
        return mySurface.compareTo(otherSurface);
    }

    @Override //polymorphism - our own implementation of a default
    public String toString() {
        return this.getClass().getSimpleName() + "Shape{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
