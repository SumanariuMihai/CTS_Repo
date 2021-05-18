package cts.sumanariu.mihai.AS.pattern.builder;

public class CreditAccount extends ContBancar{

	protected CreditAccount(int amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	int noOfInstallments;
	int creditLimit;
	
	public int getNoOfInstallments() {
		return noOfInstallments;
	}
	public void setNoOfInstallments(int noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	@Override
	public int send(ContBancar bankAccount, int amount) throws Exception {
		if(amount<this.amount)
		{
			bankAccount.setAmount(bankAccount.getAmount()+amount);
			this.amount-=amount;
			System.out.println("Internal transaction succesful!");
			return bankAccount.getAmount();
		}
		else
		{
			throw new Exception("There are no funds!");
		}
	}
	
}
