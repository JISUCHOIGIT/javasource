package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * try{} : 단독 사용 불가
 * try{} catch{}
 * try{} finally{} 
 * try{} catch(){} finally{}
 * 
 * 
 * */

public class FileInputEx {

	public static void main(String[] args) {
//		FileInputStream fis = null; // FileNotFoundException
//		try {
//			fis = new FileInputStream("file.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally { //자원해제 : 끊어내는 것
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		// 자동 리소스 닫기
		try (FileInputStream fis = new FileInputStream("file.txt");){ //finally 자원해제 역할을 해줌 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
