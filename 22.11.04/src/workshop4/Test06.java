package workshop4;

/**
 * 1)eclipse Argument 에서 1~5까지의 두 개의 정수형 데이터를 입력 받아 2차원 배열을 만든다. 
 * 2) 입력 받은 데이터가 2개 미만 또는 2개 초과로 입력 하면 “다시 입력 하세요” 출력 
 * 3) 1~5이외의 숫자가 입력 될 경우 “숫자를 확인 하세요” 출력 
 * 4) 입력 받은 두개의 정수를 이용하여 2차원 배열을 생성한다. 
 * 5) 2차원 배열에 1~5까지의 랜덤한 숫자(중복허용)를 넣는다. 
 * 6) 배열의 내용을 출력 한다. 
 * 7) 배열의 총합과 평균을 출력 한다.
 */
public class Test06 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int[][] arr;
		double sum = 0.0;

		if (args.length != 2) {
			System.out.println("다시 입력 하세요");
		} else if (num1 < 1 || num1 > 5 || num2 < 1 || num2 > 5) {
			System.out.println("숫자를 확인 하세요");
		} else {
			arr = new int[num1][num2];
			for (int i = 0; i < arr.length; i++) {
				if (i > 0)
					System.out.println();

				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (int) (Math.random() * 5 + 1);
					System.out.print(arr[i][j] + " ");
					sum += arr[i][j];
				}
			}
			System.out.printf("\nsum = %.1f\navg = %.1f", sum, sum / (num1 * num2));

		}

	}

}
