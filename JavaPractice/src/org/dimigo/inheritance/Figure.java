/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ㅣ_ Figure
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
public class Figure {
	    private int centerX; 
		private int centerY; 
	 	 
	 	Figure(){
	 		
	 	} 
	 	 
	    Figure(int centerX, int centerY){ 
		this.centerX = centerX; 
		this.centerY = centerY; 
	} 
		 
	protected double calcArea(){ 
		return 0.0; 
	} 


}