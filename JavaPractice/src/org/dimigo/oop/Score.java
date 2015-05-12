/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   ㅣ_ Score
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
import java.util.Scanner;

public class Score{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		
		System.out.print("수학 점수 입력 => ");
		int math = scanner.nextInt();
		
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		System.out.println("<< 점수 출력 >>");
		StringBuilder sb = new StringBuilder();
		sb.append("국어 점수 : ").append(kor + "\n");
		sb.append("수학 점수 : ").append(math + "\n");
		sb.append("영어 점수 : ").append(eng + "\n");
		sb.append("총첨 : ").append(kor + math + eng + "\n");
		sb.append("평균 : ").append(String.format("%.1f",(kor+math+eng)/3.0) + "\n");
		
		System.out.println(sb.toString());
	}

}
