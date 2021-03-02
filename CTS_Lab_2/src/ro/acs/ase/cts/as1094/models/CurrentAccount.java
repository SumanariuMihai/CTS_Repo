package ro.acs.ase.cts.as1094.models;

import ro.acs.ase.cts.as1094.exceptions.IllegalTransferException;
import ro.acs.ase.cts.as1094.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {

	public static final double MAX_CREDIT=5000;
	
	public CurrentAccount(String iban) {
		super(iban, CurrentAccount.MAX_CREDIT);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(Double amount) {
		// TODO Auto-generated method stub
		this.balance+=amount;
	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if(this.balance>amount)
			{this.balance-=amount;}
		else
			{		throw new InsufficientFundsException(
					"You don't have the required amount! ");
			}
	}

	@Override
	public void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException {
		// TODO Auto-generated method stub
		if(destination==this){
			throw new IllegalTransferException();
		}
		else {
			this.withdraw(amount);
			destination.deposit(amount);
		}
	}

}
