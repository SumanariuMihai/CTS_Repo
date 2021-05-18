package cts.sumanariu.mihai.AS.main;

import cts.sumanariu.mihai.AS.pattern.adapter.*;
import cts.sumanariu.mihai.AS.pattern.builder.*;

public class Main {

	public static void main(String[] args) {
		
		//Builder
		BankBuilder builder=new BankBuilder();
		DebitAccount debitAccount=builder.getDebitAmount(1000).isOverdraftActivated(false).isSalaryCollectedHere(true).BuildDebit();
		CreditAccount creditAccount=builder.getCreditAmount(500).getCreditLimit(1000).getInstallments(10).BuildCredit();
		JuniorAccount juniorAccount=builder.getJuniorAmount(100).getAge(15).getAllowance(200).BuildJunior();
		System.out.println(debitAccount.getAmount() +" "+creditAccount.getAmount() +" "+juniorAccount.getAllowance());
		System.out.println(" ");
		
		//Adapter
		IVisaProcessor card=new VisaCard(1000,0.1f);
		VisaToBankAdapter adapter=new VisaToBankAdapter(card);
		
		try {
			debitAccount.setAmount(creditAccount.send(debitAccount, 100));
			creditAccount.setAmount(debitAccount.send(creditAccount, ContBancar.convertAmount(100, 0.1f)));
			juniorAccount.setAmount(card.transfer(juniorAccount, 50, 0.15f));
			juniorAccount.setAmount(adapter.send(juniorAccount, 150));
			creditAccount.setAmount(adapter.send(creditAccount, 100));
		} catch (Exception e) {
			e.printStackTrace();
		}

		//Command - no time unfortunately
		
		
	}

}
