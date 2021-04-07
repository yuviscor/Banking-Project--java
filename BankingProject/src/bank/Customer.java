package bank;

public class Customer {
	
	/** lets create name and address variable for customer class
	 * every customer is going to have a bank account*/
	
	String name; //name 
	
	String address; //address
	
	public Customer(String name) {
		this.name=name;
		
	}
	
	// creating a method to set address
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	// to get the name of the customer
	public String getName() {
		return this.name;
	}
	
	// to get the address of the customer
	public String getaddress() {
		return this.address;
	}

}
