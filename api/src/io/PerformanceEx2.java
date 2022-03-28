package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PerformanceEx2 {

	public static void main(String[] args) {
		// FileInputStream + BufferedInputStream만 사용할 경우
			try (FileInputStream fis = new FileInputStream("d:\\temp\\hold.mp4");
				 BufferedInputStream bis = new BufferedInputStream(fis)) {
				
				long start = System.currentTimeMillis();
				while(bis.read()!=-1) {}
				long end = System.currentTimeMillis();
				
				System.out.println("FileInputStream + BufferedInputstream 사용시 "+ (end-start));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// FileInputStream + BufferedInputStream + 배열 사용할 경우
			try (FileInputStream fis = new FileInputStream("d:\\temp\\hold.mp4");
					BufferedInputStream bis = new BufferedInputStream(fis)) {

				byte data[] = new byte[4096];

				long start = System.currentTimeMillis();
				while(bis.read(data)!=-1) {}
				long end = System.currentTimeMillis();

				System.out.println("FileInputStream + BufferedInputstream + 배열 사용시 "+ (end-start));

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			// FileInputStream + BufferedInputStream + 배열 + fileoutputstem사용할 경우
			try (FileInputStream fis = new FileInputStream("d:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("d:\\temp\\hold_copy2.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				

				byte data[] = new byte[4096];

				long start = System.currentTimeMillis();
				while(bis.read(data)!=-1) {}
				long end = System.currentTimeMillis();

				System.out.println("FileInputStream + BufferedInputstream + 배열 사용시 "+ (end-start));

			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
