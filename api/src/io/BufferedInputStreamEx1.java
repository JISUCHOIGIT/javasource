package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputStreamEx1 {

	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("d:\\temp\\file1.txt"); // 읽기 위해서 inputstream 사용
			BufferedInputStream bis = new BufferedInputStream(in); // 읽어올 파일이 클 경우 보조스트림 사용
			OutputStream out = new FileOutputStream("d:\\temp\\output3.txt");
			BufferedOutputStream bos = new BufferedOutputStream(out);) {
			 //in 보조스트림
			
			 //BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\temp\\file1.txt"));
			
			 // 입력하기 위해 outputstream 사용 output2에 입력
			 // out 보조스트림
			
			// 파일 읽기 => 파일 쓰기
			byte b[] = new byte[1024];
			while(bis.read(b)!=-1) {
				bos.write(b);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
