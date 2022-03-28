package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		// 로또 번호
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		
		// 정렬 한 후 출력
		List<Integer> list = new ArrayList<Integer>(set); 
		//set을 list로 전환 후 배열
		//sort = List<T> list
		Collections.sort(list); // 정렬코드
		System.out.println(list);
		
	}

}
