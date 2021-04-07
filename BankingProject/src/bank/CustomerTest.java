package bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
	Customer customer;

	@BeforeEach
	void setUp() throws Exception {
	
	this.customer = new Customer("brandon");
	}

	@Test
	void testSetAddress() {
		
		assertNull(this.customer.getaddress());
		
		this.customer.setAddress("fazilka");
		
		assertEquals("fazilka",this.customer.getaddress());
		
	}

}
