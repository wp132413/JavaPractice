package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		int money = 0;
		String car = "고속버스";
		
		if(car == "고속버스"){
			if(distance <= 10) money = 850;
			else if(distance > 10 && distance <= 20) money = 850 + 300;
			else if(distance > 20 && distance <= 30) money = 850 + 600;
		}
		else if(car == "경차"){
			if(distance <= 10) money = 300;
			else if(distance > 10 && distance <= 20) money = 300 + 200;
			else if(distance > 20 && distance <= 30) money = 300 + 400;
		}
		else{
			if(distance <= 10) money = 600;
			else if(distance > 10 && distance <= 20) money = 600 + 200;
			else if(distance > 20 && distance <= 30) money = 600 + 400;
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + money + "원");

	}

}
