/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ㅣ_ Triangle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
public class Triangle extends Figure {
	private int width; 
 	private int height; 
 	 
	Triangle(int width, int height){ 
		this.width = width; 
 		this.height = height; 
 	} 
 	 
 	Triangle(int centerX, int centerY, int width, int height){ 
 		super(centerX, centerY); 
 		this.width = width; 
 		this.height = height; 
 	} 
 	 
	protected double calcArea(){ 
 		return width * height / 2; 
 	} 

}
