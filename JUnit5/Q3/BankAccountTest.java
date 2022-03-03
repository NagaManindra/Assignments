package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	int id;
	int amount;
	int withDrawAmount;
	BankAccount account;
	
	@BeforeEach
	void BeforeEach() {
		account=new BankAccount(id, amount);
	}

	@Test
	@DisplayName("Test1")
	void test1() {
		id=123;
		amount=19999;
		withDrawAmount=20000;
		if(withDrawAmount>amount) {
			assertThrows(InsufficientBalanceException.class, ()->account.withDraw(withDrawAmount));
		}
		else if(withDrawAmount<-1) {
			assertThrows(IllegalAccessException.class, ()->account.withDraw(withDrawAmount));
		}
	}
		
		@Test
		@DisplayName("Test2")
		void test2() {
			id=122;
			amount=0;
			withDrawAmount=20000;
			if(withDrawAmount>amount) {
				assertThrows(InsufficientBalanceException.class, ()->account.withDraw(withDrawAmount));
			}
			else if(withDrawAmount<-1) {
				assertThrows(IllegalAccessException.class, ()->account.withDraw(withDrawAmount));
			}
		}
		
		@Test
		@DisplayName("Test3")
		void test3() {
			id=122;
			amount=21000;
			withDrawAmount=20000;
			if(withDrawAmount>amount) {
				assertThrows(InsufficientBalanceException.class, ()->account.withDraw(withDrawAmount));
			}
			else if(withDrawAmount<-1) {
				assertThrows(IllegalAccessException.class, ()->account.withDraw(withDrawAmount));
			}
		}

}
