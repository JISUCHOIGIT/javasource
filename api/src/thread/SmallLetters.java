package thread;

// 하나의 작업으로 여러개 작업 같이 하는 걸 multithread
// 메인과 같이 돌아가는 프로그램 만들기 위해서 구현


//Thread라는 클래스를 상속받아서 run 안에 같이 작업할 코드를 오버라이드
public class SmallLetters extends Thread {

	@Override
	public void run() {
		//스레드로 실행할 코드 작성
		for(char ch='a';ch<='z';ch++) {
			System.out.print(ch+" ");
		}

	}

}
