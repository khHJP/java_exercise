package workshop4;

public class Test04 {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		int data = Integer.parseInt(args[0]);
		
		if(data >= 5 && data <= 10)		
		System.out.printf("\n결과: %d",calc.calculate(data));
		else {
			System.out.println("5 ~ 10 사이의 정수로 다시 입력하세요.");
		}
	} 
}
