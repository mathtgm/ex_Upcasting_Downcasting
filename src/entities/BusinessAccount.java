package entities;

public class BusinessAccount extends Account {
	private Double limitLoan;

	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double limitLoan) {
		super(number, holder, balance);
		this.limitLoan = limitLoan;
	}

	public Double getLimitLoan() {
		return limitLoan;
	}

	public void setLimitLoan(Double limitLoan) {
		this.limitLoan = limitLoan;
	}

	public void loan(double amount) {
		if (amount <= limitLoan)
			balance += amount - 10.0;
	}
}
