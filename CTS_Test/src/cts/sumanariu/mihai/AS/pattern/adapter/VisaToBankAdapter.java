package cts.sumanariu.mihai.AS.pattern.adapter;

import cts.sumanariu.mihai.AS.pattern.builder.ContBancar;

public class VisaToBankAdapter extends ContBancar{

	IVisaProcessor processor=null;
	
	public VisaToBankAdapter(IVisaProcessor processor)
	{
		super(processor.getAmount());
		this.processor=processor;
	}

	@Override
	public int send(ContBancar bankAccount, int amount) throws Exception {
		return processor.transfer(bankAccount, amount, 0);
	}
}
