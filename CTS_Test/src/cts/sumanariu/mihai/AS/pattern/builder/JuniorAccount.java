package cts.sumanariu.mihai.AS.pattern.builder;

public class JuniorAccount extends ContBancar{

	protected JuniorAccount(int amount) {
		super(amount);
	}
	
	int ownerAge;
	int allowance;
	
	public int getOwnerAge() {
		return ownerAge;
	}
	public void setOwnerAge(int ownerAge) {
		this.ownerAge = ownerAge;
	}
	public int getAllowance() {
		return allowance;
	}
	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	@Override
	public int send(ContBancar bankAccount, int amount) throws Exception {
		try {
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
		} catch (Exception e) {
			e.printStackTrace();

			return 0;
		}
	}
	
	
}
