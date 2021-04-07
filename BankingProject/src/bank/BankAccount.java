package bank;

public class BankAccount {
	String accounttype; /** Here is the account type and balance */

	double balance;
	double fastcash;

	Customer customer;
	

	public BankAccount(String accounttype, Customer customer) {

		this.accounttype=  accounttype;
		this.customer= customer;
	    this.fastcash=60;
	}
	// this method is for deposit of the amount
	public void deposit(double amount)
	{    if(amount>0) {
		this.balance+=amount;
	}
	else {
		System.out.println("You have to deposit cash, Cannot deposit 0 or nothing");
	}
		
	}

	// this method is for the withdraw of the amount
	/**This keyword after the method is use to tell java this particular method may throw an exception  */
	public void withdraw(double amount) throws Exception {
		if(this.balance<amount) {
			throw new Exception("The given amount is not available");
		}
		else {
			this.balance-=amount;
		}

	}
	public void withdrawfast() throws Exception{
		
		this.withdraw(fastcash);
	}
	public void resetfastcash(double amount) {
		if(amount>0) {
			
			this.fastcash=amount;
		}
		
	}

	// lets add some more methods to  get info of the bank account and customer info

	public String getinfoofbankacc() {

		return accounttype+" : "+this.balance;
	}
	public String getcustomerinfo() {
		return this.customer.getName()+" From "+ this.customer.getaddress(); 
	}
}
