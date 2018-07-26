package learning;

public class ClassDemo {
	public static void main(String[] args) {
		Car bmw = new Car(); //creating and inti object
		bmw.setMake("BMW");
		System.out.println(bmw.getMake());
		Car benz = new Car();
		benz.setModel("C300");
		System.out.println(benz.getModel());
		
		benz.year = 2020; // After making year public 
		System.out.println(benz.getYear());
	}

}
