package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("hong", "홍길동", "hong123")); 
		set.add(new Member("kang", "강길동", "kang123")); 
		set.add(new Member("park", "박길동", "park123")); 
		set.add(new Member("kim", "김길동", "kim123"));
		// 직접 만든 Member class는 set에서 중복 제거 안함
		// 중복 제거는 직접 정의해야 함
		// Member.java에 중복제거 소스 있음
		set.add(new Member("kim", "김길동", "kim123"));
		
		System.out.println(set);

	}

}
