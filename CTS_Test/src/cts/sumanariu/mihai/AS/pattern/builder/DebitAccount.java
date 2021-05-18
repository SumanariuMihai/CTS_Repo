package cts.sumanariu.mihai.AS.pattern.builder;

public class DebitAccount extends ContBancar {

	protected DebitAccount(int amount) {
		super(amount);
	}

	boolean isSalary;
	boolean isOverdraftActivated;
	
	
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	public boolean isOverdraftActivated() {
		return isOverdraftActivated;
	}
	public void setOverdraftActivated(boolean isOverdraftActivated) {
		this.isOverdraftActivated = isOverdraftActivated;
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
