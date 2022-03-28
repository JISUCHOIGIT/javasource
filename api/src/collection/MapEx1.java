package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * key, value 구조로 저장
 * key 값은 중복 안됨, value만 중복 가능
 * 
 * */

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		// 요소 추가
		// Map.Entry 형식으로 값을 다 가져옴
		// Map.Entry = for로 돌릴 때 키,값 모두 다 나옴
		map.put("id_0123", "홍길동");
		map.put("id_0124", "김길동");
		map.put("id_0125", "최길동");
		map.put("id_0126", "박길동");
		
		System.out.println("키에 해당하는 값 가져오기 " +map.get("id_0123")); //get(key) = value
		System.out.println("키가 존재하는지 확인하기 " +map.containsKey("id_0123")); //containsKey
		System.out.println("값이 존재하는지 확인하기 " +map.containsValue("김길동")); //containsValue
		System.out.println("Map이 비어있는지 확인하기 "+map.isEmpty());
		System.out.println("Map 크기 : " +map.size());
		System.out.println("Map 요소 삭제: "+map.remove("id_0126"));
		
		// key 값만 가져오기
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		// value 값만 가져오기
		Collection<String> values = map.values();
		System.out.println(values);
	
		System.out.println();
		
		Iterator<String> keyIter = keys.iterator();
		while(keyIter.hasNext()) { // 다음 읽을 요소가 있는가
			String key = keyIter.next(); // 다음 읽을 요소를 읽고 key,value 출력
			String value = map.get(key); // key 메서드에서 get(key) = value를 통해 값 호출
			System.out.println(key+" : "+value);
		}
		

	}

}
