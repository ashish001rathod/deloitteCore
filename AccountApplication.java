package deloittecore;
import java.util.Scanner;
public class AccountApplication {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Account Number: ");
	    int acno=sc.nextInt();
	    AccountOperations operation = new AccountOperations();
	    operation.checkAccount(acno);
		System.out.println("Enter the value      1.Check Balance     2.Deposit Cash     3.Withdraw Cash");
		int n=sc.nextInt();
		switch(n){
		case 1: operation.checkBalance(acno);
			break;
		case 2: System.out.println("Enter Amount to be deposited: ");
	            int depositValue=sc.nextInt();
	            operation.deposit(acno,depositValue);
			break;
		case 3:System.out.println("Enter Amount to be withdrawed: ");
               int withdrawAmount=sc.nextInt();
               operation.withdraw(acno,withdrawAmount);
			break;
		default: System.out.println("Invalid Operation.");	
		}

	}

}
