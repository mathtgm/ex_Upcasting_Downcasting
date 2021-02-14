package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING
		// Uma BusinessAccount � uma conta
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 500.0);
		
		//DOWNCASTING
		// Uma conta � uma BusinessAccount? N�o, temos que converte a conta para uma BusinessAccount
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);		
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
