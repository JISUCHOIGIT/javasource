package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {
		// 입력 키보드
//		InputStream in = System.in;	// Scanner sc = new Scanner(System.in);
//		
//		int input = 0;
//		try {
//			while((input = in.read()) != -1) { //문장의 끝은 -1
//				System.out.println((char)input);
//			} // read() : 한 바이트만 읽어옴
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} finally {
//				try {
//					in.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				} // 통로 닫기
//			}
			
			// try-with-resources 형태로 변경 : AutoClosable
			
			try (InputStream in = System.in) {
				int input = in.read(); //문장의 끝은 -1
				System.out.println((char)input);  // read() : 한 바이트만 읽어옴
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

