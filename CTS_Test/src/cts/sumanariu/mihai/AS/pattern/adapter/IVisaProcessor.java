package cts.sumanariu.mihai.AS.pattern.adapter;

import cts.sumanariu.mihai.AS.pattern.builder.ContBancar;

public interface IVisaProcessor {

	public int getAmount();
	public void setAmount(int amount);
	
	public int transfer(ContBancar bankAccount, int amount,float currencyConversion) throws Exception;
}
