package GameObject;

public class Rectangle extends GeometricObject {
	private double l;
	private double b;
	public Rectangle() {
		
	}
	
	public Rectangle(double l , double b) {
		this.l=l;
		this.b=b;
	}
	public double getArea() {
		
		return l*b;
	}

}
