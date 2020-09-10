package liskovPrinciple;

public class Plane extends FlyingToy{
	public void fly() {
		super.fly();// goi truc tiep den phuong thuc cua lop cha
		System.out.println("The plane toy is flying.......");
	}

}
// Expect result:
//The toy is flying
// the plane toy is flying
