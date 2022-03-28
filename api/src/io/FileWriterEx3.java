package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileWriterEx3 {

	public static void main(String[] args) {
		// 사용자로부터 데이터 입력받기 : Scanner
		// output1.txt 파일 생성
		
		
		File f = new File("d:\\temp\\output1.txt");
		
		if(!f.exists()) {
			try {
				f.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		try(Scanner sc = new Scanner(System.in);){
			// 입력받은 데이터를 파일 출력 : output1.txt
			Writer writer = new FileWriter(f);
					
			System.out.println("데이터 입력(q를 입력하면 종료) >>");
			
			String input = "";
			while(!(input=sc.nextLine()).equalsIgnoreCase("q")) {
				writer.write(input+"\r\n");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
