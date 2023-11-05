
public class SavingsAccount extends BankAccount {

	double rate = 0.025;
	int savingsNumber = 0;
	String accountNumber;
	
	public SavingsAccount( String name, double amount ) {
		super( name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	public SavingsAccount( SavingsAccount oldAccount, double amount ) {
		super( oldAccount, amount );
		savingsNumber = oldAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	public void postInterest() {
		double monthInterest = getBalance() * rate;
		deposit( monthInterest );
		
	}
	
	@Override
	public String getAccountNumber() {
		return this.accountNumber;
		
	}
	
}
