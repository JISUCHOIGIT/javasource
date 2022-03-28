package member.util;

import java.util.List;
import java.util.Scanner;

import member.dto.memberDTO;

public class ConsoleUtil {
	// MemberAddAciton 대신 consoleUtil에서 사용자에게 입력화면 제시
	public memberDTO getNewMember(Scanner sc) {
		System.out.println("member 정보 입력");
		System.out.println("=================");
		System.out.print("1. name >>");
		String name = sc.nextLine();
		System.out.print("2. addr >>");
		String addr = sc.nextLine();
		System.out.print("3. email >>");
		String email = sc.nextLine();
		System.out.print("4. age >>");
		int age = Integer.parseInt(sc.nextLine());
		
		return new memberDTO(name, addr, email, age); //받은 데이터를 객체로 만들어서 전송
	}
	
	public void printAddSucessMessage() {
		System.out.println("회원정보 추가 성공");
	}
	
	public void printAddFailMessage() {
		System.out.println("회원정보 추가 실패");
	}
	
	// list 출력 메소드
	public void printListMessage(List<memberDTO> list) {
		System.out.println();
		System.out.println("******* member List *******");
		System.out.println("-----------------------------------------");
		System.out.println("id\tname\taddr\temial\tage");
		System.out.println("-----------------------------------------");
		
		for(memberDTO dto : list) {
			System.out.printf("%d\t%s\t%s\t%s\t%d",dto.getId(),dto.getName(),dto.getAddr(),dto.getEmail(),dto.getAge());
		}
		System.out.println();
		
	}
	
	// 수정
	public int printModifyIdMessage(Scanner sc) {
		System.out.println("아이디 입력");
		System.out.println(">>");
		
		int id = Integer.parseInt(sc.nextLine());
		return id;

	}
	
	public int printModifyMessage(Scanner sc) {
		System.out.println("------- 수정항목 선택-------");
		System.out.println("1. 주소");
		System.out.println("2. 이메일");
		System.out.println(">> ");
		
		int no = Integer.parseInt(sc.nextLine());
		return no;

	}
	
	public String printModifyValueMessage(Scanner sc) {
		System.out.println("수정 내용 입력");
		System.out.print(">> ");
		
		String input = sc.nextLine();
		return input;
	} 	
	
	public void printModifySuccessMessage() {
		System.out.println("수정 성공");
	}
	
	public void printModifyFailMessage() {
		System.out.println("수정 실패");
	}
	
	// 삭제
	public int printRemoveMessage(Scanner sc) {
		System.out.println("삭제할 아이디 정보 입력");
		System.out.println(">> ");
		return Integer.parseInt(sc.nextLine()); // 3 엔터
	}
	
	public void printRemoveSuccessMessage() {
		System.out.println("삭제 성공");
	}
	
	public void printRemoveFailMessage() {
		System.out.println("삭제 실패");
	}

	
}
