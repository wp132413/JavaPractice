/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   ㅣ_ PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember mem1 = new FamilyMember("아빠"); 
	 	FamilyMember mem2 = new FamilyMember("엄마"); 
		FamilyMember mem3 = new FamilyMember("나"); 
		FamilyMember mem4 = new FamilyMember("남동생"); 
		PiggyBank piggy = new PiggyBank(); 
	 		 
		FamilyMember.printMemberCnt(); 
	 		 
	 	piggy.putMoney(mem1, 10000); 
	 	piggy.putMoney(mem2, 5000); 
	 	piggy.putMoney(mem3, 2000); 
	 	piggy.putMoney(mem4, 1000); 
	    piggy.printBalance(); 
	    piggy.putMoney(mem3, 1000); 
	    piggy.printBalance(); 
	}

}
