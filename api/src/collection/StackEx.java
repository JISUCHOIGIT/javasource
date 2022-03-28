package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* Stack (List 인터페이스 구현)
 * 마지막에 저장한 데이터를 가장 먼저 꺼낸다 => LIFO (Last In First Out) 
 * push() : 삽입, pop() : 인출, empty() : 비어있는지 확인
 * 
 * 
 * Queue (List 인터페이스 구현)
 * 처음에 저장한 데이터를 가장 먼저 꺼냄 => FIFO(First In First Out)
 * offer() : 삽입, poll() : 인출, isEmpty() : 비어있는지 확인
 * 
 * */

public class StackEx {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); // stack은 일반클래스로 new Stack 가능
		Queue<String> queue = new LinkedList<String>(); //queue는 인터페이스로 new Queue 불가
		
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		queue.offer("10");
		queue.offer("9");
		queue.offer("8");
		queue.offer("7");
		queue.offer("6");
		
		//stack에서 인출
		while(!stack.empty()) { //.Empty
			System.out.println(stack.pop());
		}
		
		System.out.println();
		
		//queue에서 인출
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
