/**
 * Write an application to perform withdraw functionality on a SavingAccount object. Point to
note:
	a. Raise InsufficientBalanceException if you are trying to withdraw more than balance
	   or when you balance is zero. E.g. if you balance is 2000 and if you are trying to
	   withdraw 2100 or if you balance is 0 and you are trying to withdraw positive value.
	b. Raise IllegalBankTransactionException if you are trying to withdraw a negative value
	   from your balance. E.g. if you try to withdraw a negative value savingAcc.withdraw(-
       1000);
Note: SavingAccount
 |-- long id
 |-- double balance
 |--double withdraw(double amount)
 |--double deposit(double amount)
 */
/**
 * import java.util.Scanner;
 * 
 * 
 * class Account { static long id; static double balance; public Account(long
 * id, double balance) { Account.id = id; Account.balance = balance; } public
 * double withDraw(double Amount) { return balance-Amount;
 * } @SuppressWarnings("unused") private double deposit(double Amount) { return
 * balance+Amount; }
 * 
 * }
 * 
 * @SuppressWarnings("serial") class InsufficientBalanceException extends
 * Exception{ public InsufficientBalanceException(String msg) { super(msg);
 * 
 * } } @SuppressWarnings("serial") class IllegalBankTransactionException extends
 * Exception{ public IllegalBankTransactionException(String msg) { super(msg); }
 * } public class ExceptionQ3 {
 * 
 * public static void main(String[] args) {
 * 
 * Account account =new Account(56789, 2000);
 * 
 * 
 * try(Scanner scanner=new Scanner(System.in);) { System.out.print("Enter
 * withDraw Amount :"); Double withDrawAmount = scanner.nextDouble();
 * 
 * if(withDrawAmount>Account.balance) { throw new
 * InsufficientBalanceException("Insufficent Balnce"); } else
 * if(withDrawAmount<-1) { throw new IllegalBankTransactionException("Illegal
 * Bank Transaction"); } else { System.out.println("Balance Amount:
 * "+account.withDraw(withDrawAmount)); }
 * 
 * } catch (InsufficientBalanceException e) { System.out.println(e); } catch
 * (IllegalBankTransactionException e) { System.out.println(e); }
 * 
 * }
 * 
 * }
 **/

class BankAccount {
	long id;
	double balance;

	public BankAccount(long id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public void withDraw(double Amount) throws Exception {
		if (Amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		} else if (Amount < -1) {
			throw new IllegalBankTransactionException("Illegal Bank Transaction");
		} else {
			System.out.println(balance - Amount);
		}
	}

	public void deposit(double Amount) {
		System.out.println(balance + Amount);
	}

}

@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String msg) {
		super(msg);

	}
}

@SuppressWarnings("serial")
class IllegalBankTransactionException extends Exception {
	public IllegalBankTransactionException(String msg) {
		super(msg);
	}
}

public class ExceptionQ3 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(123, 2000);
		try {
			account.withDraw(19000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
