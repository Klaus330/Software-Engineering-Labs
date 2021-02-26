package ro.claudiupopa;

public class Rectangle extends Shape{

    protected double width;
    protected double height;

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
        return width * height;
    }


    public Triangle[] splitIntoTriangles(){
        int n = (int) (Math.random() * 10) * 2;
        System.out.println("This is: " +  n);
        Triangle[] triangles = new Triangle[n];

        /*for(int i = 0; i < n; i++)
        {
            triangles[i] = new Triangle(width/n * (i + 0.5), height/2);
        }*/
        for(int i = 0; i < n; i = i + 2)
        {
            int ip = (int) Math.sqrt( (width/n) * (width/n) + (height / 2) * (height / 2) );
            triangles[i] = new Triangle( ip , ( (height/2) * (width / n) ) / ip);
            triangles[i + 1] = new Triangle( ip , ( (height/2) * (width / n) ) / ip);
        }
        return triangles;
    }

}
