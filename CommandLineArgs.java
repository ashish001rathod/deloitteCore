package deloittecore;

public class CommandLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int code=Integer.parseInt(args[0]);
		String name=args[1];
		double sal=Double.parseDouble(args[2]);
		System.out.println(++code);
		System.out.println(name);
		System.out.println(sal+=500);
		

	}

}
