package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a = 9, b = 10;
		double compare;
		double h1 = 5.8, h2 = 5.4;
		double trape, parallel;
		
		trape = (a + b) * h1 / 2;
		parallel = a * h2;
		
		if(trape > parallel){
			compare = trape - parallel;
			System.out.println("사다리꼴이 평행사변형 보다 " + compare + " 더 큽니다.");
		}
		
		else if(trape < parallel){
			compare = parallel - trape;
			System.out.println("평행사변형이 사다리꼴 보다 " + compare + " 더 큽니다.");
		}
		
		else System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다");

	}

}
