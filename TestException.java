package deloittecore;

public class TestException {

	public static void main(String[] args) throws ArithmeticException {
		int x=7;
		int y=3;
		int a[]={1,2,3,4,5,6};
		try{
			int r=x/y;
			System.out.println("result= "+r);
			System.out.println("value= "+a[6]);
		}
		catch(ArithmeticException|IndexOutOfBoundsException e){
			e.printStackTrace();
			}
		System.out.println("success");

	}

}
