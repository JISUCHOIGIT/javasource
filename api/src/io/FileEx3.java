package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {

	public static void main(String[] args) {
		
		File temp = new File("d:\\temp");
		File dir = new File("d:\\temp\\dir");
		File file1 = new File("d:\\temp\\file1.txt");
		File file2 = new File("d:\\temp\\file2.txt");
		File file3 = new File(temp,"file3.txt");
		File file4 = new File(dir,"file4.txt");

		
		//디렉토리 생성
		if (!dir.exists()) { //존재하는지 확인 : exists()
			dir.mkdirs(); //dir 생성 : mkdir(), mkdirs()
		}
		
		//파일 생성
		try {
			if(!file1.exists()) {
			file1.createNewFile();
			}
			if(!file2.exists()) {
				file2.createNewFile();
			}
			if(!file3.exists()) {
				file3.createNewFile();
			}
			if(!file4.exists()) {
				file4.createNewFile();
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		System.out.println("    날짜     시간      형태       크기     이름");
		System.out.println("---------------------------------------------");
		
		//읽고 쓰는건 하지 못함
		File[] files = temp.listFiles(); //listFiles()
		for(File f:files) {
			System.out.println(sdf.format(new Date(f.lastModified()))); //lastModified() : 파일이 최종 변경된 시간날짜 보여줌
			if (f.isDirectory()) { //isDirectory
				System.out.println("\t<DIR>\t\t\t"+f.getName());
			} else {
				System.out.println("\t\t\t"+f.length()+"\t"+f.getName());
			}
			System.out.println();
		}

	}

}
