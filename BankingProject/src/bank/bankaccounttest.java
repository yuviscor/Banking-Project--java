package bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class bankaccounttest {
          Customer customer;
          BankAccount bankaccount;
	@BeforeEach
	void setUp() throws Exception {
	this.customer = new Customer("yuvi");
	this.bankaccount = new BankAccount("savings",this.customer);
	
	
	}

	@Test
	void testDeposit() {
		this.bankaccount.deposit(100);
		
		assertEquals(100,this.bankaccount.balance);
		
		
	}

	@Test
	void testWithdraw() {
		this.bankaccount.deposit(100);
		
		try {
			this.bankaccount.withdraw(80);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(20,this.bankaccount.balance);
	  
		assertThrows(Exception.class,()
				->{
					this.bankaccount.withdraw(21);
			});
	assertDoesNotThrow(() ->{
		this.bankaccount.withdraw(19);
	});
	
	assertEquals(1,this.bankaccount.balance);
	
	}

	@Test
	void testWithdrawfast() {
		this.bankaccount.deposit(100);
		this.bankaccount.resetfastcash(40);
		assertEquals(40,this.bankaccount.fastcash);
		
		try {
        this.bankaccount.withdrawfast();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		assertEquals(60,this.bankaccount.balance);
	}

}
