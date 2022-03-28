package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {

	public static void main(String[] args) {
//		int arr[] = {37,21,56,99,88,58,62,15,39,78};
		Integer arr[] = {37,21,56,99,88,58,62,15,39,78};
		
		// 내름차순 정렬
		// sort(int[]) in the type Arrays is not applicable for the arguments (int[], Comparator.reverseOrder())
		// sort(T[] a, Compar~~)
		// T, E, K, V : 객체를 의미
		Arrays.sort(arr,Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
