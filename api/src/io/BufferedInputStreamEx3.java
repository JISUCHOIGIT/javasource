package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 프로그램 동작을 위해서 사용하는 것 = '자원'


public class BufferedInputStreamEx3 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("d:\\temp\\pawel.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("d:\\temp\\pawel_copy.jpg");//파일을 1개 더 복사하는 개념
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			
			// 읽어 오는 방식은 배열을 만들어서 읽어오는 게 처리가 빠름
			int data;
			while((data=bis.read())!=-1) { // read : 1바이트씩 read
				bos.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
