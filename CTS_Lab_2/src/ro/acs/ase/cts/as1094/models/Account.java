package ro.acs.ase.cts.as1094.models;

import ro.acs.ase.cts.as1094.exceptions.IllegalTransferException;
import ro.acs.ase.cts.as1094.exceptions.InsufficientFundsException;

public abstract class Account {
	
	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount) throws InsufficientFundsException;
	public abstract Object getBalance();
	public abstract void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException;
}
