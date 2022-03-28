package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("jsp");
		list.add("html");
		list.add("css");
		list.add("mybatis");
		
		// System.out.println(list); to.String 정의 단순 확인용
		
		for (int i = 0; i < list.size(); i++) { // size = length
			System.out.println(list.get(i)); // for문 + get(i) = 요소 가져와서 출력
		}
		
		System.out.println();
		
		for(String s : list) { //향상된 for문 돌면서 배열 1개씩 s에 담기
			System.out.println(s);
		}

	}

}
