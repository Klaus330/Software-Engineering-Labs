package ro.claudiupopa;

public class Square extends Rectangle{
    protected double side;

    public Square(double side){
        super();
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return side*side;
    }
}
