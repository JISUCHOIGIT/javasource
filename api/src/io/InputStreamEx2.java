package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		// 입력 키보드
		InputStream in = System.in;	// Scanner sc = new Scanner(System.in);
		
		try {
			int input = in.read(); // read() : 한 바이트만 읽어옴
			System.out.println((char)input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
