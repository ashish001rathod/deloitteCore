package deloittecore;

public class Aeroplane implements Vehicle{

	public static void main(String[] args) {
		Vehicle vehicle= new Aeroplane();
		vehicle.wheels();
		vehicle.engine();

	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("No. of wheels="+10);
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("No. of engine="+4);
	}

}
