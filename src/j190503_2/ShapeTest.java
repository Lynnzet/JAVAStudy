package j190503_2;

abstract class Shape{
	protected int x, y;
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public abstract void draw();
}

class Rectangle extends Shape {
	private int width, height;
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
}
class Triangle extends Shape{
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}
class Circle extends Shape {
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Shape s1, s2, s3, s4;
			
			s2 = new Rectangle();
			s3 = new Triangle();
			s4 = new Circle();
			

			s2.draw();
			s3.draw();
			s4.draw();
	}

}
