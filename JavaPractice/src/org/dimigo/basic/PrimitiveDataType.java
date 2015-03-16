package org.dimigo.basic;

/**
 * << 첫번째 수행평가 과제>>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015.3.13
 * @author 박준호
 * @version 1.0
 */

// 수정

public class PrimitiveDataType {
	public static void main(String[] args) {
		String name = "아이유";
		boolean sexual = true;
		int age = 23;
		double tall = 161.8;
		float fat = 44.3f;
		char blood = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.printf("이름  : %s\n", name);
		if(sexual) System.out.println("성별  : 여자");
		System.out.printf("나이  : %d\n", age);
		System.out.printf("키  : %.1f\n", tall);
		System.out.printf("몸무게  : %.1f\n", fat);
		System.out.printf("혈액형 : %c\n", blood);
		
	}

}
