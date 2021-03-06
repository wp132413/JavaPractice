/**
 * 
 */
package org.dimigo.inheritance;
//
/**
 * <pre>
 * org.dimigo.inheritance
 *   ㅣ_ FigureTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
public class FigureTest { 
	public static void main(String[] args){ 
		Circle circle = new Circle(5); 
		Triangle triangle = new Triangle(10, 10, 5, 8); 
		Rectangle rectangle = new Rectangle(20, 20, 5, 8); 
		 		 
		System.out.println("원의 넓이 : " + circle.calcArea()); 
		System.out.println("삼각형의 넓이 : " + triangle.calcArea()); 
     	System.out.println("사각형의 넓이 : " + rectangle.calcArea()); 
     	
     	System.out.println("");
     	circle.printCenter();
     	triangle.printCenter();
     	rectangle.printCenter();
     	System.out.println("--중심좌표 이동 (x, y축 5씩)");
     	
     	circle.moveFigure(5, 5);
     	triangle.moveFigure(5, 5);
     	rectangle.moveFigure(5, 5);
     	
     	circle.printCenter();
     	triangle.printCenter();
     	rectangle.printCenter();
	} 
}
