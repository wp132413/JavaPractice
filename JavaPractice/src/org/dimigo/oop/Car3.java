/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   ㅣ_ Car
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
public class Car3 {
	public String company = "현대자동차";
	public String model = "제네시스";
	public String color = "검정색";
	public int maxSpeed = 225;
	public int price = 50000000;
	
	public Car3(String company, String model, String color, int maxSpeed, int price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	public Car3(String company, String model, String color, int maxSpeed){
		this(company, model, color, maxSpeed, 0);
	}
	
	public Car3(String company, String model, String color){
		this(company, model, color, 0, 0);
	}
	
	public String getCompany(){
		return company;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public int getPrice(){
		return price;
	}

}

