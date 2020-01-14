package deloittecore;

public class Circle extends Shape {

	public Circle(double radius) {
		super(radius);
	}
	@Override
	public void area()
	{
		double areaOfCircle= pi*(radius*radius);
		//System.out.println(radius);
		System.out.println("Area of the Circle is="+ areaOfCircle );
		//return areaOfCircle;
		
	}
	public static void main(String[] args) {
		
		double radius=Double.parseDouble(args[0]);
		//System.out.println(radius);
		Shape circle= new Circle(radius);
		circle.area();
	}
}