package openClosedPrinciple;

public class Circle implements Shape{
	public double radius;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
	

}
