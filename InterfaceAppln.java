package deloittecore;

public class InterfaceAppln implements One,Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One one=new InterfaceAppln();
		System.out.println(x);
		one.methodOne();
		Three three =new InterfaceAppln();
		three.methodTwo();
		Two two=new InterfaceAppln();
		two.methodTwo();

	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("method two");
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("method one");
	}

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("method three");
	}

}
