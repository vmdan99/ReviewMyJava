package interfaceSegregationPrinciple;

public class ToyRobot implements Toy,Movable{
	String color;

	@Override
	public void move() {
		System.out.println("ToyRobot is strating moving....");
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

}
