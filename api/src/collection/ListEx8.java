package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx8 {

	public static void main(String[] args) {
		// Scanner를 사용하여 5개의 실수 값을 사용자로부터 받아서 ArrayList에 저장한 후 검색하여
		// 가장 큰 수 출력
		// 예시)
		// 입력값 : 3.14 2.1 -5.5 99.9 33.7 => "3.14 2.1 -5.5 99.9 33.7" 공백으로 토큰 나누기
		// 출력값 : 가장 큰 수는 99.9
		
		
		// 스캐너
		Scanner sc = new Scanner(System.in);
		
		// 리스트에 넣기
		List<Double> list = new ArrayList<Double>();
		
		// 숫자입력
		System.out.println("5개의 실수를 입력하세요 >> ");
		String input = sc.nextLine();
		
		// 공백 기준 분리
		StringTokenizer token = new StringTokenizer(input); //StringTokenizer
		while(token.hasMoreTokens()) {
			// String을 Double로 바꾸기
			list.add(Double.parseDouble(token.nextToken())); //Double.parseDouble()
		}
		
		System.out.println(list);
		
		double max = 0;
		for(Double value: list) {
			if(max < value) {
				max = value;
			}
		}
		System.out.println("가장 큰 수는 " + max);
		
		// Collections.sort(), Collections.max() / for 사용하지 않고서 최대값 구할 수 있음
		System.out.println("가장 큰 수는 "+Collections.max(list));
		

	}

}
