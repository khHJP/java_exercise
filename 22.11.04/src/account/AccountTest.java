package account;

public class AccountTest {

	public static void main(String[] args) {		
		// account 객체생성
		Account acc = new Account("441-0290-1203", 500000, 7.3);
		// account 기본정보 출력
		System.out.println(acc.toString());
		// 20000원 입금
		acc.deposit(20000);
		// 변경정보 출력
		System.out.println(acc.toString());
		// 이자 출력
		System.out.println("이자: " + acc.calculateInterest());
	}

}
