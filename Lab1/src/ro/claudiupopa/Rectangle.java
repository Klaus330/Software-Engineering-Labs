package ro.claudiupopa;

public class Rectangle extends Shape{

    protected double width;
    protected double height;

    public Rectangle() {}
    public Rectangle(double width, double height){
        System.out.println("I am a rectangle");
        this.width = width;
        this.height = height;
    }

    public Rectangle(Square square){
        this.width = square.side;
        this.height = square.side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double computeArea() {
        return width*height;
    }


    public Triangle[] splitIntoTriangles(){



        return new Triangle[2];
    }

}
