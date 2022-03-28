package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 객체 전송
 * 직렬화(Serialization)
 * 객체 개념으로 읽지는 못함
 * 네트워크 통해 전송 가능하고 저장이 가능
 * 
 * 
 * */

// java.io.NotSerializableException

public class PersonEx {

	public static void main(String[] args) {
		Person personLee = new Person("이순신", "엔지니어");
		Person personKim = new Person("김유신", "선생님");
		
		//직렬화
		try (FileOutputStream fos = new FileOutputStream("d:\\temp\\serial.dat");
			//객체 보조스트림
			//객체 자체를 파일에 사용하려면 ObjectOutputStream
			ObjectOutputStream oos = new ObjectOutputStream(fos) ){ 
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//역직렬화
		 try (FileInputStream fis = new FileInputStream("d:\\temp\\serial.dat");
			  ObjectInputStream ois = new ObjectInputStream(fis)) {
			 
			 for(int i=0; i<2; i++) {
				 Person p = (Person) ois.readObject();
				 System.out.println(p);
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
