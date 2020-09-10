package liskovPrinciple;

public class main {

	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.fly();// tai sao lai co ket qua nhu vay:
		
		Car car = new Car();
		car.move();
	}

}
