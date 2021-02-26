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

		Triangle[] triangles = r.splitIntoTriangles();
		System.out.println("We split rectangle in: " + triangles.length);
		for( int i = 0; i < triangles.length; i++) {
			System.out.println("Triangle " + i + ": " + triangles[i].computeArea());
		}
		double Aria = (double) triangles[0].computeArea() * triangles.length * 4;
		System.out.println(Aria);
    }
}
