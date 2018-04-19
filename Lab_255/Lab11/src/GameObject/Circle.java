package GameObject;

public class Circle extends GeometricObject {

	private double radius;
	
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius= radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}

	
	
}
