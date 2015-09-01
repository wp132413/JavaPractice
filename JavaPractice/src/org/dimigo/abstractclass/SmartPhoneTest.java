/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ㅣ_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 26.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone i = new IPhone("IPhone6", "애플", 700000);
		SmartPhone g = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(i.toString());
		i.turnOn();
		i.pay();  
	 	i.useSpecialFunction(); 
	 	i.turnOff();
	 	System.out.println();
	 	
	 	System.out.println(g.toString());
	 	g.turnOn();
		g.pay(); 
	 	g.useSpecialFunction(); 
	 	g.turnOff();
	}

}
