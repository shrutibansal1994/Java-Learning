package learning;

public class Car {

	private String color;
	int speed;
	int gear;
	private String make;
	public Car() {
		this.speed=0;
		this.gear=0;
		System.out.println("Executing witout arrguments");
	}
	public Car(int speed,int gear) {
		this.speed=speed;
		this.gear=gear;
		System.out.println("Executing with arguments");
	}
	private String model;
	public int year;
	public void increasespeed() {
		System.out.println("Increase the speed");
	}
	public void setMake(String make)
	{
		this.make = make;
		
	}
public String getMake() {
	return this.make;
	
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
}
