package deloittecore;

public class Customer {
private int customerId;
private String customerName;
private String city;
public int getCustomerId() {
	return customerId;
}

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(int customerId, String customerName, String city) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.city = city;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
