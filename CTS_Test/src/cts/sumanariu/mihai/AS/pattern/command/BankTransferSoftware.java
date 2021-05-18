package cts.sumanariu.mihai.AS.pattern.command;

import cts.sumanariu.mihai.AS.pattern.builder.ContBancar;

public class BankTransferSoftware extends BankModule{


	@Override
	public void doTask(ContBancar TransferFrom, ContBancar TransferTo, int amount) {
		this.setAccountThatTransfers(TransferFrom);
		this.setAccountToTransferTo(TransferTo);
		
		
		
	}

}
