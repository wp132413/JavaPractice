/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ㅣ_ IPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
public class IPhone extends SmartPhone {
	public IPhone(){
		
	}
	
	public IPhone(String model, String company, int price){
		super(model, company, price);
	}
	
	public void pay(){
		System.out.println("애플페이로 결재합니다.");
	}
	
	public void useAirDrop(){
		System.out.println("Airdrop기능을 사용합니다.");
	}

}
