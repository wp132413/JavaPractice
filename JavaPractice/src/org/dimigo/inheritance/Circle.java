/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ㅣ_ Circle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
public class Circle extends Figure {
	private int radius;  	 
 	Circle(int radius){ 
 		this.radius = radius; 
 	} 
 	 
 	Circle(int centerX, int centerY, int radius){ 
 		super(centerX, centerY); 
 		this.radius = radius; 
 	} 
 	 
 	protected double calcArea(){ 
 		return Math.PI * radius * radius; 
 	} 

}
