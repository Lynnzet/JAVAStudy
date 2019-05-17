package j190503_3;

class Shape {
	protected int x,y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape {
	private int width, height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape{
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle extends Shape {
	private int radisu;
	
	public void draw() {
		System.out.println("Circle Draw");
	}
}

public class ShapeTest {
	private static Shape arrayOfShapes[];
	
	public static void main(String[] args) {
		
		init();
		drawAll();
		// TODO Auto-generated method stub
//			Shape s1, s2, s3, s4;
//			
//			s1 = new Shape();
//			s2 = new Rectangle();
//			s3 = new Triangle();
//			s4 = new Circle();
//			
//			s1.draw();
//			s2.draw();
//			s3.draw();
//			s4.draw();
	}
	
	public static void init() {
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();
	}
	public static void drawAll() {
		for(int i=0;i<arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
	}

}
