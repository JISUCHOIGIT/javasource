package io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/*
 * InputStreamReader : 문자 변환 보조 스트림 / 스트링으로 입력된 걸 문자로 변환한다
 * 바이트 스트림 => 문자(char) 기반
 * */

public class InputStreamReaderEx1 {

	public static void main(String[] args) {
		 // 문자라면 바이트기반으로 읽던걸 문자기반으로 읽어서 문자로 내보내주겠다
		
		 //파일에서 읽어오겠다

		try(InputStream in = new FileInputStream("d:\\temp\\file1.txt"); //InputStream 먼저 선언 후
			InputStreamReader reader = new InputStreamReader(in,Charset.forName("ms949"))){ // InputStreamReader 사용 , 리더로 바꿔줄게!
			
			char cbuf[] = new char[100];
			while(reader.read(cbuf)!=-1) {
				System.out.println(cbuf);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
