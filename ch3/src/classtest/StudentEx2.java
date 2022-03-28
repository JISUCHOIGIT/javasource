package classtest;

public class StudentEx2 {

	public static void main(String[] args) {
		//Student2 객체 생성
		Student2 student = new Student2();
		System.out.println("학번 : "+student.studentId);
		System.out.println("이름 : "+student.studentName);
		
		//new Student2(); // new 실행될 때 마다 default 생성자 값이 출력
		
		System.out.println();
		
		//인자를 받는 생성자를 호출하면서 객체 생성
		Student2 student2 = new Student2(20110202, "홍길동");
		System.out.println("학번 : "+student2.studentId);
		System.out.println("이름 : "+student2.studentName);
		System.out.println("주소 : "+student2.address); // 초기화 null
		System.out.println("핸드폰 : "+student2.mobile); // 초기화 null
		
		Student2 student3 = new Student2(201112012,"성춘향","강남");
		
				
			
	}
}
