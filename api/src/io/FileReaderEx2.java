package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

public class FileReaderEx2 {

	public static void main(String[] args) {
		// 입력 : 파일, 출력 : 화면
		// == InputStream (동영상,이미지 모두 다 읽을 수 있음) 
		try (Reader reader = new FileReader("d:\\temp\\file1.txt",Charset.forName("ms949"));) {
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.println((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
	}

}
