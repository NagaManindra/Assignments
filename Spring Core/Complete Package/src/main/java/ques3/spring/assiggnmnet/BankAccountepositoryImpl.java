<<<<<<< HEAD
package ques3.spring.assiggnmnet;

public class BankAccountepositoryImpl implements BankAccountRepository{
	
	BankAccount account;
	
	

	public BankAccountepositoryImpl(BankAccount account) {
		super();
		this.account = account;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		this.account.accountBalance=newBalance;
		return newBalance;
	}

	@Override
	public double getAccountBalance(long accountId) {
		return account.accountBalance;
	}

}
=======
package ques3.spring.assiggnmnet;

public class BankAccountepositoryImpl implements BankAccountRepository{
	
	BankAccount account;
	
	

	public BankAccountepositoryImpl(BankAccount account) {
		super();
		this.account = account;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		this.account.accountBalance=newBalance;
		return newBalance;
	}

	@Override
	public double getAccountBalance(long accountId) {
		return account.accountBalance;
	}

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
