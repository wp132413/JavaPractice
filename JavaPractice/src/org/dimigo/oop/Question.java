/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *   ㅣ_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String q1 = "빅뱅";
	    String q2 = "원빈";
		String q3 = "자바";
		
		System.out.println("가장 좋아하는 가수는?");
		String a1 = scanner.nextLine();
		if(q1.equals(a1))
			System.out.println("정답");
		else System.out.println("오답");
		
		System.out.println("가장 좋아하는 배우는?");
		String a2 = scanner.nextLine();
		if(q2.equals(a2))
			System.out.println("정답");
		else System.out.println("오답");
		
		System.out.println("가장 좋아하는 과목은?");
		String a3 = scanner.nextLine();
		if(q3.equals(a3))
			System.out.println("정답");
		else System.out.println("오답");
		
	}

}
