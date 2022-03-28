package arrays;

import java.util.Arrays;

// BinarySearch : 이진검색

public class ArrayBinarySearch {

	public static void main(String[] args) {
		int arr[] = {11,13,25,27,36,45,65}; // 정렬이 되어 있어야 함
		
		// 검색
		System.out.println(Arrays.binarySearch(arr, 45));
		System.out.println(Arrays.binarySearch(arr, 36));
		

	}

}
