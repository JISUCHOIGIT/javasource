package member.controller;

import java.util.Scanner;

import member.action.Action;

public class memberController {
	public void processReqeust(Action action, Scanner sc) { // 메인 매개변수
		//사용자의 요청을 처리하는 액션 클래스의 메소드를 호출
		try {
			action.execute(sc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
