// Numbered comments are just for assignment observation sake, and I would not include it in practice in clean code
package ro.ase.stud.assignment.classes; //1

import ro.ase.stud.assignment.interfaces.*; //7
import ro.ase.stud.assignment.classes.outsourcedServices.BrokerServices;
import ro.ase.stud.assignment.exceptions.*;

public class BankLoanAccount implements MonthlyRateGettable	{ //2
	//3
	public double loanValue; //4
	public double interestRate;	//5
	public int daysActive;
	public int accountType; //4.1
	public static final int	STANDARD=0,BUDGET=1,PREMIUM=2,SUPER_PREMIUM=3; 
	public static final int DAYS_IN_YEAR=365; //17
	
	public double getLoan() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}
	
	public double getRate() { //6
		System.out.println("The rate is "+interestRate);
		return this.interestRate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() { //7
		return loanValue * interestRate;
	}
	
	public void setLoanValue(double newLoanValue ) throws InvalidLoanValueException { //8
		if(newLoanValue >= 0)
			loanValue = newLoanValue;
		else
		{
			throw new InvalidLoanValueException();
		}
	}
	
	/* 10
	 public String to_string() {
	return "Loan: "+this.loanValue+"; rate: "+this.interestRate+"; days active:"+daysActive+"; Type: "+accountType+";";
	}*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Loan: ");
		builder.append(loanValue);
		builder.append("; Interest Rate: ");
		builder.append(interestRate);
		builder.append("; Days Active: ");
		builder.append(daysActive);
		builder.append("; Account Type: ");
		builder.append(accountType);
		builder.append(";");
		return builder.toString();
	}

	// 11
	public void print() throws UselessFunctionException {
		/*int vb = 10;
		System.out.println("This is an account");*/
		throw new UselessFunctionException();
	}
	
	public static double getPrincipalInterestRate(BankLoanAccount account) //14
	{
		return account.loanValue*(Math.pow(account.interestRate,(account.daysActive/DAYS_IN_YEAR)) - 1); //15
	}
	
	public static double applyBrokerServices(double principalInterest) //14
	{
		BrokerServices brokerFeeRate=new BrokerServices(); //12
		return brokerFeeRate.getBrokerFee() * principalInterest;
	}
	
	public static double addAccountFeeToTotalFee(BankLoanAccount account,double totalFee) { //14
		totalFee+= applyBrokerServices(getPrincipalInterestRate(account));
		return totalFee;
	}

	public static double calculateTotalFee(BankLoanAccount[] accounts) //13 14 16
	{
		//18 - erased pointless lines
		double totalFee=0.0;
		for	(int i=0;i<accounts.length;i++)	{
			if(accounts[i].accountType==BankLoanAccount.PREMIUM||accounts[i].accountType==BankLoanAccount.SUPER_PREMIUM) //12	
				totalFee=addAccountFeeToTotalFee(accounts[i],totalFee);	
		}
		return	totalFee;
	}

	public BankLoanAccount(double loanValue, double interestRate, int accountType) throws InvalidLoanValueException {//19 
		setLoanValue(loanValue); //20
		this.interestRate = interestRate;
		this.accountType = accountType;
	}
	
	
}