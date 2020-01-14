package deloittecore;

public class CustomerApplication {

	public static void main(String[] args) {
		Customer customer= new Customer();
		customer.setCustomerId(1234);
		customer.setCustomerName("DELOITTE");
		customer.setCity("HYDERABAD");
		Customer customer1=new Customer(1111,"AMAZON","CALIFORNIA");
		Customer customer2=new Customer(2222,"MICROSOFT","NEW JERSEY");
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getCity());
		System.out.println();
		System.out.println(customer1.getCustomerId());
		System.out.println(customer1.getCustomerName());
		System.out.println(customer1.getCity());
		System.out.println();
		System.out.println(customer2.getCustomerId());
		System.out.println(customer2.getCustomerName());
		System.out.println(customer2.getCity());

	}

}
