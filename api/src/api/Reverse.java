package api;

public class Reverse {

	public static void main(String[] args) {
		String str = "ABzqaurtK";
		
		// 거꾸로 출력
		String reverse = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i)+" ");
		}
		
		System.out.println();
		
		char[] chArr = str.toCharArray();
		
		for (int i = chArr.length-1; i >= 0; i--) {
			System.out.print(chArr[i]);
		}
		System.out.println();
		
		//StringBuilder reverse
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		System.out.println(builder);
	}

}
