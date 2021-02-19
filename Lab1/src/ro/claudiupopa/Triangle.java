package ro.claudiupopa;

public class Triangle  extends Shape{

    protected double base;
    protected double height;


    public Triangle(double base, double height){
        System.out.println("I am a triangle");
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double computeArea() {
        return (base*height)/2;
    }
}
