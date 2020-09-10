package liskovPrinciple;

public class Car extends LandToy {
	public void move() {
		super.move();
		System.out.println("The car is moving.....");
	}

}
