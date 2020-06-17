package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Stack 클래스
 * @author karzin
 *
 */
public class Stack {
	
	//Stack 변수 생성 (List)
	private List<String> stack = null;
	
	//Stack 변수에서 pop된 데이터를 저장
	private List<String> popValues = null;
	
	//생성자 - stack을 초기화해줌
	Stack() {
		stack = new ArrayList<String>();
		popValues = new ArrayList<String>();
	}
	
	//stack에 값을 넣음(push)
	public void push(String pushValue) {
		stack.add(pushValue);
	}
	
	//stack에서 값을 뺌(pop)
	public String pop() {
		String popValue = "Stack이 비어있습니다.";
		
		if(stack.size() > 0) {
			popValue = stack.remove(stack.size()-1);
			popValues.add(popValue);
		} else {
			System.err.println(popValue);
		}
		
		return popValue;
	}
	
	//stack 내부에 있는 값을 모두 출력한다.
	public void printStack() {
		int i = 0;
		
		for(String value : stack) {
			if(i < value.length()) {
				i = "| ".length() + value.length() + " |".length();
			}
		}
		
		for(int s = stack.size()-1; s >= 0; s--) {
			int length = "| ".length() + stack.get(s).length() + " |".length();
			length = i-length;
			System.err.print("| "+stack.get(s));
			for(int j = 0; j < length; j++) {
				System.err.print(" ");
			}
			System.err.print(" |");
			System.err.println();
			for(int j = 0; j < i; j++) {
				System.err.print("-");
			}
			System.err.println();
		}
		
		System.err.println();
	}
	
	//popValues 변수에 있는 값을 순서대로 보여줌.
	public void printPopValue() {
		System.out.print("popValues ==> ");
		System.out.println(popValues);
		
		System.out.println();
	}

}
