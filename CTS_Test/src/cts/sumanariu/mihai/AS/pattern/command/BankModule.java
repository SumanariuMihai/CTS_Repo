package cts.sumanariu.mihai.AS.pattern.command;

import cts.sumanariu.mihai.AS.pattern.builder.ContBancar;

public abstract class BankModule {

	ContBancar accountThatTransfers;
	ContBancar accountToTransferTo;
	
	public abstract void doTask(ContBancar TransferFrom,ContBancar TransferTo, int amount);

	public ContBancar getAccountThatTransfers() {
		return accountThatTransfers;
	}

	public void setAccountThatTransfers(ContBancar accountThatTransfers) {
		this.accountThatTransfers = accountThatTransfers;
	}

	public ContBancar getAccountToTransferTo() {
		return accountToTransferTo;
	}

	public void setAccountToTransferTo(ContBancar accountToTransferTo) {
		this.accountToTransferTo = accountToTransferTo;
	}
	
}
