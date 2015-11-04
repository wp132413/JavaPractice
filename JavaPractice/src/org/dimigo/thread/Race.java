/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   ㅣ_ Race
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
public class Race {
	public static void main(String[] args) { 
		System.out.println("main thread start"); 
 		 
 		Thread t1 = new Runner("정욱재"); 
 		Thread t2 = new Runner("방현우"); 
 		
 		t2.setPriority(Thread.MAX_PRIORITY); 
 		t1.setPriority(Thread.MIN_PRIORITY); 
 		 
 		t1.start(); 
 		t2.start(); 
 		 
 		System.out.println("main thread end"); 
 	} 
}
