package ro.claudiupopa;

public class Circle extends Shape {
    protected double area;
    protected double radius;
    public double PI = 3.14;


    public Circle(double radius){
        System.out.println("I am a Circle");
        this.radius = radius;
    }

    public void setRadius(double rad){
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return PI*radius*radius;
    }
}
