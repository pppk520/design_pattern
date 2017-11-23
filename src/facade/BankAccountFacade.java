package facade;

public class BankAccountFacade {
	private int accountNumber;
	private int securityCode;

	WelcomeToBank bankWelcome;
	
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	public BankAccountFacade(int newAcctNum, int newSecCode) {
		accountNumber = newAcctNum;
		securityCode = newSecCode;

		bankWelcome = new WelcomeToBank();
		
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();

	}
	
	public void withdrawCash(double cashToGet) {
		if(acctChecker.accountActive(accountNumber) &&
		   codeChecker.isCodeCorrect(securityCode) &&
		   fundChecker.withdraw(cashToGet)) {
				System.out.println("Transaction Complete\n");
				
		} else {
				System.out.println("Transaction Failed\n");
		}		
	}
	
	public void depositCash(double cashToDeposit) {
		if(acctChecker.accountActive(accountNumber) &&
		   codeChecker.isCodeCorrect(securityCode) &&
		   fundChecker.deposit(cashToDeposit)) {
				System.out.println("Transaction Complete\n");
				
		} else {
				System.out.println("Transaction Failed\n");
		}		
	}
	
}
