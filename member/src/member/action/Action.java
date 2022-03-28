package member.action;

import java.util.Scanner;

public interface Action {
	void execute(Scanner sc) throws Exception; // 자기들이 감당 못하는 오류 방지
}
