package com.sh.test;
/**
 * 1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.

     - 정수형 100, 9999억, 
       - 실수 486.567(float), 567.890123
       - 문자 A
       - 문자열 Hello world, 
       - 논리 true
     
     단, 변수를 이용하여 출력하시오 .

     com.sh.test.Test1 에 작성
 *
 */
public class Test1 {
	public static void main(String[] args) {
		int num = 100;
		long num2 = 999_900_000_000L;
		
		float fnum = 486.567F;
		double dnum = 567.890123;
		
		char ch = 'A';
		String str = "Hello world";
		boolean bool = true;
		
		System.out.println(num);
		System.out.println(num2);
		
		System.out.println(fnum);
		System.out.println(dnum);
		
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);

	}
	
	
}
