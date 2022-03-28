package io;

import java.io.Serializable;

public class Person implements Serializable{ //Serializable : 인터페이스

	// 직렬화 : 인스턴스를 저장, 전송
	// 역직렬화 : 저장된 내용을 다시 복원
	
	// 역직렬화 시 직렬화 된 것과 같은 클래스냐? 구별
	private static final long serialVersionUID = -6280674694624427221L;
//	private static final long serialVersionUID = 1L;
	
	private String name;
	private String job;
//	transient String job; //transient : 이 필드는 직렬화 시키지 않겠다
	
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
}
