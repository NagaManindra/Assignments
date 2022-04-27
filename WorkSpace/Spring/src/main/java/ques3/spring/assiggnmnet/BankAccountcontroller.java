package ques3.spring.assiggnmnet;

public class BankAccountcontroller extends BankAccountServiceImpl {

	public BankAccountcontroller(BankAccount account) {
		super(account);
	}

	/**
	 * @Override public double withdraw(long accountId, double balance) throws
	 *           Exception { if(balance>accountBalance) { throw new
	 *           InsufficientBalanceException("Insufficent Balnce"); } else
	 *           if(balance<-1) { throw new IllegalBankTransactionException("Illegal
	 *           Bank Transaction"); } else {
	 * 
	 *           return updateBalance(accountId,accountBalance-balance); }
	 * 
	 *           }
	 * 
	 * @Override public double deposit(long accountId, double balance) {
	 *           Auto-generated method stub
	 * 
	 *           return updateBalance(accountId, accountBalance+balance); }
	 * 
	 * @Override public double getBalance(long accountId) { method stub return
	 *           getAccountBalance(accountId); }
	 * 
	 * @Override public boolean fundTransfer(long fromAccount, long toAccount,
	 *           double amont) throws Exception { withdraw(fromAccount, amont);
	 *           deposit(toAccount, amont);
	 * 
	 *           return true; }
	 * 
	 *           }
	 * 
	 **/

	@Override
	public double withdraw(long accountId, double balance) throws Exception {
		return super.withdraw(accountId, balance);

	}

	@Override
	public double deposit(long accountId, double balance) {
		return super.deposit(accountId, balance);
	}

	@Override
	public double getBalance(long accountId) {
		return super.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) throws Exception {
		return super.fundTransfer(fromAccount, toAccount, amont);
	}

}
