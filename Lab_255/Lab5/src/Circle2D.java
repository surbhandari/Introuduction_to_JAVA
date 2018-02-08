/**************************************************
*                     Circle2D                    *
*-------------------------------------------------*
* -x: double                                      *
* -y: double                                      *
* -radius: double                                 *
* +Circle2D()                                     *
* +Circle2D(x: double, y: double, radius: double) *
* +getX(): double                                 *
* +getY(): double                                 *
* +getRadius(): double                            *
* +getArea(): double                              *
* +getPerimeter(): double                         *
* +contains(x: double, y: double): boolean        *
* +contains(Circle2D: circle): boolean            *
* +overlaps(Circle2D: circle): boolean            *
**************************************************/

// Implement Circle2D class
public class Circle2D {
	/**  Data fields */
	private double x;
	private double y;
	private double radius;
	
	/** Create a default Circle2D with 
	*  (0,0) for (x,y) and 1 for radius */
	public Circle2D(){
		this.x=0;
		this.y=0;
		this.radius=1;
	}
	/** Create a Circle2D with specified x,y, and radius */
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	/** Return x */
	public double getx() {
		return x;
	}
	/** Return Y */
	public double gety() {
		return y;
	}
	/** Return y */
	public double getRadius() {
		return radius;
	}
	/**returns the area of the circle */
	public double getArea() {
		double area = Math.PI*radius*radius;
		return area;
	}
	/**returns the perimeter of the circle */
	
	public double getPerimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	
	/** Return true if the specified point
	*   (x, y) is inside this circle     */
	
	public boolean contains(double x, double y) {
		double dist = Math.pow((Math.pow(x-this.x, 2)+ Math.pow(y-this.y, 2)),0.5);
		return dist<this.radius;
	}

	/** Return true if the specified 
	*   circle is inside this circle */
	
	public boolean contains(Circle2D circle) {
		double dist = Math.pow((Math.pow(circle.x-this.x, 2)+ Math.pow(circle.y-this.y, 2)),0.5);
		if(dist <= Math.abs((circle.radius-radius))) {
			return true;
		}
		else 
			return false;
	}

	/** Return true if the specified 
	*   circle overlaps with this circle */
	
	public boolean overlaps(Circle2D circle) {
		double dist = Math.pow((Math.pow(circle.x-this.x, 2)+ Math.pow(circle.y-this.y, 2)),0.5);
		if(dist <= Math.abs((circle.radius+radius))) {
			return true;
		}
		else 
			return false;
	}


}
