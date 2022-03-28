package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderEx2 {

	public static void main(String[] args) {
		// 자바 소스파일을 읽어서 화면에 출력
		// src/io/PerformanceEx2.java
		// 출력문 앞에 번호를 붙여서 화면에 보여주기
		
		try (FileReader reader = new FileReader("src\\io2\\PerformanceEx2.java");
			 BufferedReader bis = new BufferedReader(reader);) {
			
			String str = null;
			int i = 1;
			while((str = bis.readLine()) != null) { //readLine
					System.out.println(i + " "+ str);
					i++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
