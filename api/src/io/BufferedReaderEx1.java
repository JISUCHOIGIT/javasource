package io;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;



public class BufferedReaderEx1 {

	public static void main(String[] args) {
		//단순 텍스트라면 reader로 가능
		try (Reader in = new FileReader("d:\\temp\\file1.txt"); // 텍스트전용 읽기
//			java.io.InputStreamReader in = new java.io.InputStreamReader(new FileInputStream("d:\\temp\file1.txt"));
			BufferedReader bis = new BufferedReader(in);  // 텍스트전용 buffered reader
			Writer out = new FileWriter("d:\\temp\\output2.txt"); // 텍스트전용 쓰기
			BufferedWriter bos = new BufferedWriter(out);) { // 텍스트전용 buffered wirter
			
			String str = null;
			while((str = bis.readLine()) != null) { //readLine: 한줄단위로 읽는
				bos.write(str);
				bos.newLine(); //엔터
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
