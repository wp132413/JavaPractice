/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   ㅣ_ AgeCheckExmple
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
@SuppressWarnings("serial")
public class AgeCheckException extends Exception {

	AgeCheckException(){
		
	}
	
	AgeCheckException(Movie movie){ 
 		System.out.println(movie.getTitle() + " 영화는 " + movie.getLimitAge() + "세 이상 관람가입니다."); 
 	} 
}
