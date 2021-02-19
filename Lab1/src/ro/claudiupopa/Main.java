package ro.claudiupopa;

public class Main {

    public static void main(String[] args) {
	    Circle c = new Circle(3);
	    c.setRadius(5);
	    System.out.println(c.computeArea());

	    Triangle t = new Triangle(3,5);
	    t.setBase(6);
	    t.setHeight(9);
		System.out.println(t.computeArea());


		Rectangle r = new Rectangle(4,9);
		r.setHeight(7);
		r.setWidth(8);
		System.out.println(r.computeArea());

		Square s = new Square(4);
		s.setSide(5);
		System.out.println(s.computeArea());


		Rectangle rec = new Rectangle(s);
		System.out.println(rec.computeArea());
    }
}
