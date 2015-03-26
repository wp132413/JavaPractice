package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 31;
		int dis;
		int pay;
		int plus;
		int total;
		String car = "고속버스";
		
		dis = (distance-1)/10;
		
		if(car == "고속버스"){
			pay = 850;
			plus = 300;
		}
		else if(car == "경차"){
			pay = 300;
			plus = 200;
		}
		else{
			pay = 600;
			plus = 200;
		}
		
		total = pay + plus * dis;
		
		System.out.println("<<<고속도로 통행료 계산>>>");
		System.out.println("거리 : " +distance +"km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + total +"원");

	}

}
