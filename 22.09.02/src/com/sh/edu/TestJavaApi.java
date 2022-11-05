package com.sh.edu;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 * @ 실습문제 3 
 * 자바 기본 API활용 
 * package : com.sh.edu 
 * class : TestJavaApi 
 * 메소드 : public
 * static void main(String[] args){ }
 * 
 * 자바에서 지원하는 API 중 java.util.Date, java.time.LocalDateTime 클래스를 이용해서 오늘 날짜를 출력하세요 
 * 출력형식 : 2020/08/14
 */
public class TestJavaApi {

	public static void main(String[] args) {
		// 1. java8 이전: java.util.Date 
		Date nowDate = new Date(); // Date객체 생성
		
		// 형식객체 SimpleDateFormat 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); 	
		System.out.println(sdf.format(nowDate));
		
		
		// 2. java8 이후: java.time.LocalDateTime 
		LocalDateTime today = LocalDateTime.now(); // 현재 날짜, 시간

		// 형식객체 DateTimeFormatter 사용
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/DD");
		System.out.println(today.format(dtf));
		
		// 한줄로 표현가능
		System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
	}

}
