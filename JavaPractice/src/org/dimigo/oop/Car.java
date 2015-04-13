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
public class Car {
	public String company = "현대자동차";
	public String model = "제네시스";
	public String color = "검정색";
	public int maxSpeed = 225;
	public int price = 50000000;
	
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
	
	public void setCompany(String newCompany){
		company = newCompany;
	}
	
	public void setModel(String newModel){
		model = newModel;
	}
	
	public void setColor(String newColor){
		color = newColor;
	}
	
	public void setMaxSpeed(int newMaxSpeed){
		maxSpeed = newMaxSpeed;
	}
	
	public void setPrice(int newPrice){
		price = newPrice;
	}

}
