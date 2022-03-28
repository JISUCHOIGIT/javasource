package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args) {
		// 입력 : 키보드, 출력: 화면
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte arr[] = new byte[100]; //읽은 걸 배열 생성 후 넣기
		
		try {
			while((in.read(arr) != -1)) {
			out.write(arr);  // 형변환 하지 않고 그대로 출력
			} 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
