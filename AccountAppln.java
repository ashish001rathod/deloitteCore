package deloittecore;

public class AccountAppln {

	public static void main(String[] args) {
		Account account=new Account();
		account.setAccountNumber(111111);
		account.setCustomerName("deloitte");
		account.setBalance(5300.45);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getCustomerName());
		System.out.println(account.getBalance());

	}

}
