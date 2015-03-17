package org.dimigo.basic;

/**
 * << 두번째 수행평가 과제>>
 * 내용 : 디미베네 연간 인건비
 * 작성일자 : 2015.3.17
 * @author 박준호
 * @version 1.0
 */

public class Promotion {
	public static void main(String[] args) {
		
		int money = 1700000;
		byte worker = 3;
		short market = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", money));
		System.out.println("점포 내 직원 수  : " + String.format("%,d", worker));
		System.out.println("점포 수 : " + String.format("%,d", market));
		
		long total = (long)money * 12 * (long)worker * (long)market;
		
		System.out.println("연간 인건비  : " + String.format("%,d", total));
		
	}

}
