package deloittecore;

public class AccountOperations {
	
		Account1[] accounts=new Account1[5];
		public AccountOperations() {
			accounts[0] = new Account1(10011, "deloitte", 8000);
			accounts[1] = new Account1(10012, "cognizant", 5000);
			accounts[2] = new Account1(10013, "accenture", 9000);
			accounts[3] = new Account1(10014, "capgemini", 4000);
			accounts[4] = new Account1(10015, "ernst&young", 7000);
		}
		void deposit(int acno,double amount){
			for(int i=0;i<5;i++){
				if(accounts[i].getAccno()==acno){
					System.out.println("Present Balance = "+(accounts[i].getBalance()));
					System.out.println("Deposited Amount= "+amount);
					double newBalance=(accounts[i].getBalance()+amount);
					accounts[i].setBalance(newBalance);
					System.out.println("Updated Balance= "+(accounts[i].getBalance()));
				}
				else if(i==6)
					System.out.println("INVALID ACCOUNT NUMBER");
			}
			
		}
		void withdraw(int acno,double amount){
			for(int i=0;i<5;i++){
				if(accounts[i].getAccno()==acno){
					try{
						if(accounts[i].getBalance()<amount)
							throw new InsufficientBalanceException();
					}
					catch(InsufficientBalanceException e){
						//e.printStackTrace();
						System.out.println(e.getMessage());
						
					}
					System.out.println("Present Balance = "+(accounts[i].getBalance()));
					System.out.println("Withdrawn Amount= "+amount);
					double newBalance=(accounts[i].getBalance()-amount);
					accounts[i].setBalance(newBalance);
					System.out.println("Updated Balance= "+(accounts[i].getBalance()));
				}
				else if(i==6)
					System.out.println("INVALID ACCOUNT NUMBER");
			}
			
		}
		void checkBalance(int acno){
			int j=0;
			for(int i=0;i<5;i++){
				if(accounts[i].getAccno()==acno){
					System.out.println("Present Balance = "+(accounts[i].getBalance()));
					j=1;
				}
				
			}
				try{
					if(j==0)
						throw new AccountNotFoundException();
				}
				catch(AccountNotFoundException e){
					//e.printStackTrace();
					System.out.println(e.getMessage());
					
				}
					
		}
		void checkAccount(int acno){
			int j=0;
			for(int i=0;i<5;i++){
				if(accounts[i].getAccno()==acno){
					j=1;
				}
				
			}
				try{
					if(j==0)
						throw new AccountNotFoundException();
				}
				catch(AccountNotFoundException e){
					//e.printStackTrace();
					System.out.println(e.getMessage());
					
				}
					
			
		}
}
