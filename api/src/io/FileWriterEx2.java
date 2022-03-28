package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileWriterEx2 {

	public static void main(String[] args) {
		// 사용자로부터 데이터 입력받기 : Scanner
		// output2.txt 파일 생성
		// 입력받은 데이터를 파일 출력 : output2.txt
		
		Scanner sc = new Scanner(System.in); // Scanner
		File file = new File("d:\\temp\\output2.txt"); // 파일 생성위한 객체 생성
		
		if(!file.exists()) { // 파일이 존재하지 않는다면 파일 생성
			try {
				file.createNewFile(); // 객체.createNewFile() 파일생성
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println(">>"); // 입력
		String input = sc.nextLine(); // 입력받은 내용 변수 저장
		
		try (Writer write = new FileWriter("d:\\temp\\output2.txt")) { // 파일 입력 객체 생성 FileWriter(저장할 루트)
			write.write(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
