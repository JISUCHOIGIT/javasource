package array;

public class ArrayEx10 {

	public static void main(String[] args) {
		int scores[][] = {
				{15,25},
				{45,55,65},
				{75,85,95,105}
		}; // 직접 2차원 배열 만들기

		for(int score[]:scores) {
			for(int j:score) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
