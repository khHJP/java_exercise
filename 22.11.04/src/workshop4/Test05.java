package workshop4;

public class Test05 {

	public static void main(String[] args) {
		// 1 2 4 7 8
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		
		if (num >= 1 && num <= 5) {
			for (int i = num; i <= 10; i++) {
				if ((i % 3 != 0) && (i % 5 != 0)) {
					sum += i;
					System.out.print(i);
					if (i < 8) {
						System.out.print(" + ");
					}
				}

			}
			System.out.printf("\n결과: %d", sum);
		} else {
			System.out.println("1 ~ 5 사이의 정수를 다시 입력하세요.");
		}
	}

}
