package facade;

public class FundsCheck {
	private double cashInAccount = 1000.00;
	
	public double getCashInAccount() { return cashInAccount; }
	
	public boolean withdraw(double cashWithdrawn) {
		if (cashWithdrawn <= cashInAccount) {
			cashInAccount -= cashWithdrawn;
			
			System.out.println(String.format("withdraw (%s), current balance = %s", cashWithdrawn, cashInAccount));
			return true;
		} else {
			System.out.println(String.format("money is not enough, current balance = %s", cashInAccount));
			return false;	
		}
		
		
	}
	
	public boolean deposit(double cashDeposited) { 
		cashInAccount += cashDeposited;
		
		System.out.println(String.format("deposit (%s), current balance = %s", cashDeposited, cashInAccount));
		
		return true;
	}
	
	
}
