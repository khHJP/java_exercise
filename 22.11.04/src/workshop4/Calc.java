package workshop4;

public class Calc {
	public int calculate(int data) {
		int sum = 0;

		System.out.print("짝수: ");
		
		if(data / 2 == 0) {
		  for(int i = 2; i <= data; i += 2) {
			  sum += i;
			  System.out.print(i + " ");
		  } 
		} 
		else {
			for(int i = 2; i < data; i += 2) {
				sum += i;
				System.out.print(i + " ");
			}
		}	
		return sum;	
	}
}
