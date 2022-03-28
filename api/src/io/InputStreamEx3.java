package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {

	public static void main(String[] args) {
		// 입력 : 키보드, 출력: 화면
//		InputStream in = System.in;
//		OutputStream out = System.out;
//		
//		int input = 0;
//		try {
//			while ((input = in.read()) != -1) {
//				out.write(input);
//			} // 형변환 하지 않고 그대로 출력
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
		
		
		try (InputStream in = System.in;
			OutputStream out = System.out;){
			int input = in.read();
			out.write(input);
			} 
			catch (IOException e) {
			e.printStackTrace();
		}
	}

}
