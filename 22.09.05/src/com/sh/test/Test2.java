package com.sh.test;
/**
 * 2. 자신의 신상정보를 저장할 변수를 만들고 정보를 변수에 대입, 출력하는 프로그램을 작성하세요.
(System.out.printf 사용할것.)
     - 이름, 나이, 성별,주소, 전화번호, 이메일      

=======================================================================
이름         나이       성별          전화번호            이메일          주소
=======================================================================
홍길동        22        남        01012341234    hgd@naver.com    경기도 광주시
홍길순        20        여        010123412341   hgs@gmail.com    전라남도 광주시                            

작성한 변수를 재사용해 팀메이트의 정보를 다시 변수에 대입 출력하는 프로그램으로 수정하세요.


com.sh.test.Test2 에 작성
 *
 */
public class Test2 {
	
	public static void main(String[] args) {
	String name = "홍길동";
	int age = 22;
	char gender = '남';
	String phone = "01012341234";
	String email = "hgd@naver.com";
	String address = "경기도 광주시";
	
	System.out.println("=======================================================================");
	System.out.printf("%-7s %s %7s %10s %13s %14s\n", "이름", "나이", "성별", "전화번호", "이메일", "주소");
	System.out.println("=======================================================================");
	System.out.printf("%-7s %d %7c %15s %16s %12s\n", name, age, gender, phone, email, address);
	System.out.printf("%-7s %d %7c %15s %16s %12s\n", 
			name = "홍길순", age = 22, gender = '여', phone = "010123412341", email = "hgs@gmail.com", address = "전라남도 광주시");
	}
	
}
