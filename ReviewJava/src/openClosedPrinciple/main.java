package openClosedPrinciple;

public class main {
	public static void main(String[] args){
		
		Rectangle  rectangle = new Rectangle(10,80);
		System.out.println(rectangle.getArea());
		
		Circle circle = new Circle(5);
		System.out.println(circle.getArea());
		
		AreaManager areaManager = new AreaManager();
		double value = areaManager.getShapeArea(new Rectangle(80,90));
		System.out.println(value);
	}

}
