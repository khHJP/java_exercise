package account;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;

	public Account() {}

	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	// 현재 잔액 기준 이자 계산
	public double calculateInterest() {
		return balance * interestRate / 100;
	}
	// 입금
	public void deposit(int money) {
		this.setBalance(money + balance);
	}
	// 출금
	public void withdraw(int money) {
		if(money > balance) System.out.println("잔액이 부족합니다.");
		else this.setBalance(balance - money);
	}
	// account 정보 출력
	public String accountInfo() {
		return "계좌번호: " + account + " 잔액: " + balance + " 이자율: " + interestRate + "%";
	}

	@Override
	public String toString() {
		return "계좌정보: " + account + "  현재잔액: " + balance;
	}
	
	
	
}
