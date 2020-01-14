package deloittecore;

public class Rectangle extends Shape {

	public Rectangle(double length, double breadth) {
		super(length, breadth );
		// TODO Auto-generated constructor stub
	}
	@Override
	public void area()
	{
		double areaOfRectangle= length*breadth;
		//System.out.println(breadth);
		System.out.println("Area of the Rectangle is="+ areaOfRectangle );
		//return areaOfRectangle;
	}


	public static void main(String[] args) {
		double length=Double.parseDouble(args[0]);
		double breadth=Double.parseDouble(args[1]);
		//System.out.println(breadth);
		Shape rectangle=new Rectangle(length ,breadth);
		rectangle.area();
	}

}

