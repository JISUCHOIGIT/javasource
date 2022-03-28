package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListEx6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("배");
		list.add("키위");
		list.add("딸기");
		list.add("바나나");
		
		// toArray
		// List => 배열
		// toArray => Object로 반환
		Object[] fruits = list.toArray(); 
		for (Object obj : fruits) {
			System.out.println(obj);
		}
		
		// 배열 => List
		String f[] = {"사과","배","키위","딸기","바나나","자두","멜론"};
		List<String> list1 = Arrays.asList(f);
		System.out.println(list1);
		
		 
		// java.lang.UnsupportedOperationException
		// 배열에서 list로 만든거기때문에 기존 공간이 있기에 추가로 add 불가
		
		// 배열로부터 생성한 리스트의 변화가 필요할 때
		// new로 새로 생성 후 변화
		List<String> list2 = new ArrayList<String>(Arrays.asList(f));
		list2.add("딸기");
		System.out.println(list2);
		
	}
}














