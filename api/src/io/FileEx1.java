package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {

	public static void main(String[] args) throws IOException {
		// 파일 객체 생성
		// \t, \n
		File f1 = new File("c:\\temp\\test1.txt");
		File f2 = new File("c:\\temp","test1.txt"); //경로명 + 파일명
		File dir = new File("c:\\temp");
		File f3 = new File(dir,"test1.txt");
			
		//파일명
		String fileName = f1.getName(); //getName();
		System.out.println("경로를 제외한 파일명 : "+fileName); // test1.txt , txt = 확장자
		
		//확장자를 제외한 파일명
		int pos = fileName.lastIndexOf("."); //5
		System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0,pos));
		System.out.println("확장자 : " + fileName.substring(pos+1));
		
		//경로를 포함한 파일명
		System.out.println("경로를 포함한 파일명 : " +f1.getPath()); //getPath(); c:\temp\test1.txt
		System.out.println("파일의 절대경로 : " +f1.getAbsolutePath()); //getAbsolutePath();  c:\temp\test1.txt
		System.out.println("파일의 정규경로 : " +f1.getCanonicalPath()); //getCanonicalPath(); C:\Temp\test1.txt
		System.out.println("파일이 속해있는 부모경로 : " +f1.getParent()); //getParent(); c:\temp
		
		System.out.println();
		System.out.println("File.pathSeparator - " + File.pathSeparator); // ;
		System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar); // ;
		System.out.println("File.Separator - " + File.separator); // \
		System.out.println("File. - " + File.separatorChar); // \
		
		

	}

}
