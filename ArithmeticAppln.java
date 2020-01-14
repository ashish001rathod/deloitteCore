package deloittecore;

public class ArithmeticAppln {

	public static void main(String[] args) {
		Arithmetic arithmetic=(x,y)->{//lambda expression used as functional interface implemented.
			System.out.println("it is add method.");
		return (x+y);
		};
		System.out.println(arithmetic.add(10,20));
		arithmetic.output();

	}

}
