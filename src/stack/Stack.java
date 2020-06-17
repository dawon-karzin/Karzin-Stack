package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Stack Ŭ����
 * @author karzin
 *
 */
public class Stack {
	
	//Stack ���� ���� (List)
	private List<String> stack = null;
	
	//Stack �������� pop�� �����͸� ����
	private List<String> popValues = null;
	
	//������ - stack�� �ʱ�ȭ����
	Stack() {
		stack = new ArrayList<String>();
		popValues = new ArrayList<String>();
	}
	
	//stack�� ���� ����(push)
	public void push(String pushValue) {
		stack.add(pushValue);
	}
	
	//stack���� ���� ��(pop)
	public String pop() {
		String popValue = "Stack�� ����ֽ��ϴ�.";
		
		if(stack.size() > 0) {
			popValue = stack.remove(stack.size()-1);
			popValues.add(popValue);
		} else {
			System.err.println(popValue);
		}
		
		return popValue;
	}
	
	//stack ���ο� �ִ� ���� ��� ����Ѵ�.
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
	
	//popValues ������ �ִ� ���� ������� ������.
	public void printPopValue() {
		System.out.print("popValues ==> ");
		System.out.println(popValues);
		
		System.out.println();
	}

}
