package bank;
import java.util.Scanner;
public class Bank {
	
	public void run() {
		//lets create name and other information.
		System.out.println("Welcome, What is your name");
		
		// taking input from the user as name
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hello "+name+ "  welcome to cental bank of india we are creating checking and savings account.");
		
		Customer customer = new Customer(name);
		
		//lets get the address from the customer from the user
		System.out.println("Enter the address please.");
		String address = scanner.next();
		System.out.println(name+" Is this your address "+address);
		customer.setAddress(address);
		System.out.println();
		//lets create bank account with details
		BankAccount bankaccount = new BankAccount("checking",customer);
		//lets get the information of the customer from the method we created in the bank account class.
		System.out.println("This is the customer information "+bankaccount.getcustomerinfo().toUpperCase());
		
		//lets get the bank account information.
		System.out.println();
		System.out.println("This is the info of you bank account "+bankaccount.getinfoofbankacc().toUpperCase());
		
		//Now we are going to declare amount and pass it to the deposit method.
		System.out.println();
	    System.out.println("Enter the amount you want to deposit. ");
	    System.out.println();
	    double amount = scanner.nextDouble();
	    bankaccount.deposit(amount);
	    System.out.println();
	    System.out.println("This is the info of you bank account after the deposit "+bankaccount.getinfoofbankacc().toUpperCase());
		System.out.println();
		System.out.println("Enter the amount to withdraw. ");
		amount =  scanner.nextDouble();
		System.out.println();
		try {
		bankaccount.withdraw(amount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("This is the info of you bank account after withdrawal"+bankaccount.getinfoofbankacc().toUpperCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Bank bank = new Bank();
//          bank.run();
//          
	}

}
