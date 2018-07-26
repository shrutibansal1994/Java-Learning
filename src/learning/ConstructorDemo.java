package learning;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		Car C2 = new Car(10, 1);
		System.out.println(C2.speed);
		System.out.println(C2.gear);
	}
}
