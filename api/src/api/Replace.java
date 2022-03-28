package api;

public class Replace {
	public static void main(String[] args) {
		// String : immutable(불변) 객체
		
		
		
		String str1 = "Hello Java. Hello Java";
		System.out.println(str1.replace("Java", "자바"));
		
		// str은 불변, 변하지 않음
		// 원본을 파괴하고 새로 생성
		String str2 = str1.replace("Java", "자바"); // 새로 할당
		System.out.println(str2); 
		
		String str4 = str1.replaceFirst("Java","자바");
		System.out.println(str4);

		String str3 = "Hello";
		str2 += "안녕하세요";
		str2 += "반갑습니다";
		str2 += "감사합니다";
		str2 += "안녕히가세요";
		System.out.println(str2);
		
	}
}
