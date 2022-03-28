package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx5 {

	public static void main(String[] args) {
		// Member 클래스 담기
		List<Member> list = new ArrayList<Member>();
		
		// new Member 생성 후 초기화
		list.add(new Member("hong", "홍길동", "hong123")); 
		list.add(new Member("kang", "강길동", "kang123")); 
		list.add(new Member("park", "박길동", "park123")); 
		list.add(new Member("kim", "김길동", "kim123")); 
		
		System.out.println(list); //toString형식으로 출력
		
		System.out.println();
		
		for(Member member: list) {
			System.out.println(member.getId()+"\t"+member.getName()+"\t"+member.getPassword());
		}
		
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member.getId()+"\t"+member.getName()+"\t"+member.getPassword());
		}
		
		

	}

}
