package deloittecore;

public abstract class Shape {
	protected double length;
	protected double breadth;
	protected double radius;
	final double pi=3.14;

	public Shape(double radius) {
		this.radius= radius;
		// TODO Auto-generated constructor stub
	}

	public Shape(double length, double breadth) {
		this.length= length;
		this.breadth=breadth;
		// TODO Auto-generated constructor stub
	}
	public abstract void area();



}
