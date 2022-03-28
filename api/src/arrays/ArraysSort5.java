package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort5 {

	public static void main(String[] args) {
		Integer arr[] = {37,21,56,99,88,58,62,15,39,78};
		
		Arrays.sort(arr,Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(arr));

	}

}
