package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class PerformanceEx1 {

	public static void main(String[] args) {
		// FileInputStream만 사용할 경우
		try (FileInputStream fis = new FileInputStream("d:\\temp\\pawel.jpg")) {
			
			long start = System.currentTimeMillis();
			while(fis.read()!=-1) {}
			long end = System.currentTimeMillis();
			
			System.out.println("FileInputStream만 사용시 "+ (end-start));

		} catch (Exception e) {
			e.printStackTrace();
		}
		// FileInputStream + BufferedInputStream만 사용할 경우
			try (FileInputStream fis = new FileInputStream("d:\\temp\\pawel.jpg");
				 BufferedInputStream bis = new BufferedInputStream(fis)) {
				
				long start = System.currentTimeMillis();
				while(bis.read()!=-1) {}
				long end = System.currentTimeMillis();
				
				System.out.println("FileInputStream + BufferedInputstream 사용시 "+ (end-start));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
