/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *   ㅣ_ SaveImageFromUrl
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 27.
 * </pre>
 *
 * @author  : 박준호
 * @version : 1.0
 */
public class SaveImageFromUrl {
	public static void main(String[] args) throws Exception{
		try{
			String imageUrl = "http://static.dimigo.in/img/logobeta.png";
			URL url = new URL(imageUrl);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}


