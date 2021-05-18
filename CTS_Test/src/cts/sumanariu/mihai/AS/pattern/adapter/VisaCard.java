package cts.sumanariu.mihai.AS.pattern.adapter;

import cts.sumanariu.mihai.AS.pattern.builder.ContBancar;

public class VisaCard implements IVisaProcessor{

	int amount;
	float exchangeRate;
	
	@Override
	public int transfer(ContBancar bankAccount, int amount,float currencyConversion) throws Exception {
		if(amount<this.amount)
		{
			this.exchangeRate=currencyConversion;
			amount=(int) (amount*this.exchangeRate);
			bankAccount.setAmount(bankAccount.getAmount()+amount);
			this.amount-=amount;
			System.out.println("External transaction succesful with exchange rate "+this.exchangeRate);
			return bankAccount.getAmount();
		}
		else
		{
			throw new Exception("There are no funds!");
		}
	}
	

	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(int exchangeRate) {
		this.exchangeRate = exchangeRate;
	}



	public VisaCard(int amount, float exchangeRate) {
		super();
		this.amount = amount;
		this.exchangeRate = exchangeRate;
	}
	
	
	
	

}
