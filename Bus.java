package deloittecore;

public class Bus implements Vehicle{

	public static void main(String[] args) {
		Vehicle vehicle=new Bus();
		vehicle.wheels();
		vehicle.engine();

	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("No. of wheels="+6);
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("No. of engine="+1);
	}

}
