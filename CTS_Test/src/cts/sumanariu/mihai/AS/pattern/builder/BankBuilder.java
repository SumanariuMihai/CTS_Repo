package cts.sumanariu.mihai.AS.pattern.builder;

public class BankBuilder {

	private DebitAccount debitAcc=new DebitAccount(0);
	private CreditAccount creditAcc=new CreditAccount(0);
	private JuniorAccount juniorAcc=new JuniorAccount(0);
	
	public BankBuilder getDebitAmount(int amount) {
		debitAcc.amount=amount;
		return this;
	}
	
	public BankBuilder getCreditAmount(int amount) {
		creditAcc.amount=amount;
		return this;
	}
	
	public BankBuilder getJuniorAmount(int amount) {
		juniorAcc.amount=amount;
		return this;
	}
	
	public BankBuilder isSalaryCollectedHere(boolean salary) {
		debitAcc.isSalary=salary;
		return this;
	}
	
	public BankBuilder isOverdraftActivated(boolean overdraft) {
		debitAcc.isOverdraftActivated=overdraft;
		return this;
	}
	
	public BankBuilder getInstallments(int installments) {
		creditAcc.noOfInstallments=installments;
		return this;
	}
	
	public BankBuilder getCreditLimit(int limit) {
		creditAcc.creditLimit=limit;
		return this;
	}
	
	public BankBuilder getAge(int age) {
		juniorAcc.ownerAge=age;
		return this;
	}
	
	public BankBuilder getAllowance(int allowance) {
		juniorAcc.allowance=allowance;
		return this;
	}
	
	public DebitAccount BuildDebit() {
		return this.debitAcc;
	}
	
	public CreditAccount BuildCredit() {
		return this.creditAcc;
	}
	
	public JuniorAccount BuildJunior() {
		return this.juniorAcc;
	}
	
}
