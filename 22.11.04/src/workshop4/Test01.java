package workshop4;

/**
 * 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성 하시오.
 */
public class Test01 {

	public static void main(String[] args) {
		int[][] arr2 = { { 5, 5 },
				{ 10, 10, 10, 10, 10 }, 
				{ 20, 20, 20 },  
				{ 30, 30, 30, 30 } 
		};

		int total = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				total += arr2[i][j];
			}
		}
		;

		// 전체 값 개수
		int num = 0;
		for (int i = 0; i < arr2.length; i++) {
			num += arr2[i].length;
		}
		;

		System.out.println("total = " + total);
		System.out.println("average = " + (double)total/num);

	}
}
