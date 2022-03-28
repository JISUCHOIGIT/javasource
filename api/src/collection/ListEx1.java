package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * List 인터페이스
 * - 순서가 있음
 * - 데이터 중복 허용함
 * - 구현클래스 : ArrayList, Vector, LinkedList, Stack...
 * - ArrayList, Vector: 배열의 개념
 * - LinkedList : ArrayList, Vector 배열의 개념을 단점 보완
 * - 배열과 동일(향상된 버전임)
 * */


public class ListEx1 {

	public static void main(String[] args) {
		
		//정수 : int(기본타입) => Integer(객체타입)
		//List 인터페이스이므로 new List불가 => new ArrayList
		//ArrayList = 우선순위 제일 높음
		
		//ArrayList 생성
		// 
		// ArrayList 10개의 공간이 생성
		List<Integer> list = new ArrayList<Integer>(); 
		// 내가 넣는 순서로 배열을 순서대로 유지
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(2); // 중복 허용
		
		System.out.println(list); // 주소가 나오지 않고 배열 출력 + toString 오버라이딩
		
		list.add(3, 11); // 삽입할 index번호 + 삽입할 숫자
		
		System.out.println(list);
		
		System.out.println();
		
		for(Integer i : list) {
			System.out.print(i + " ");
		}

	}

}
