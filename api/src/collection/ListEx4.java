package collection;

import java.util.List;
import java.util.Vector;

// ArrayList = Vector 동일
// ArrayList를 더 많이 사용
// 데이터를 읽어오고 저장하는데 효율이 좋음
// 단점 : 용량을 변경할 때는 효율이 떨어짐 (기존에 쓰던 걸 다시 복사하는 걸 효율이 떨어짐)
//		 처음부터 넉넉하게 공간을 잡기

public class ListEx4 {

	public static void main(String[] args) {
		
		List<String> list = new Vector<String>();
		
		list.add("1");
		list.add("3");
		list.add("5");
		list.add("7");
		
		System.out.println(list);
		
		// 내용 삭제 + ArrayList에서도 clear사용가능
		list.clear();
		System.out.println("clear() 후" + list);
		
	}

}
