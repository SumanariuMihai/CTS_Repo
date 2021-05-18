package cts.sumanariu.mihai.AS.pattern.builder;

public abstract class ContBancar {

	int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		amount = amount;
	}

	protected ContBancar(int amount) {
		super();
		this.amount = amount;
	}
	
	public static int convertAmount(int amount, float currencyConversion)
	{
		return (int) (amount * currencyConversion);
	}
	
	public abstract int send(ContBancar bankAccount, int amount) throws Exception;
	
	
	
}
