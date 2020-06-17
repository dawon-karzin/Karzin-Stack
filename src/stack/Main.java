package stack;

import java.util.Scanner;

/**
 * 완성된 Stack 테스트용 Main
 * @author karzin
 *
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Karzin-Stack");
		System.out.println("");
				
		Stack stack = new Stack();
		
//		값을 직접 넣으면서 테스트 해보고 싶다면 아래 주석을 풀고 44번부터 60번까지 주석처리
//		boolean execute = true;
//		
//		while(execute) {
//			System.out.println("1 : push, 2 : pop, 3 : 종료");
//			System.out.print("원하는 작업을 입력해주세요 : ");
//			Scanner s = new Scanner(System.in);
//			switch(s.nextInt()) {
//			case 1 :
//				System.err.print("Push 값 입력 : ");
//				Scanner value = new Scanner(System.in);
//				String pushValue = value.nextLine();
//				stack.push(pushValue);
//				stack.printStack();
//				break;
//			case 2 :
//				System.err.println("Pop 실행");
//				stack.pop();
//				stack.printPopValue();
//				break;
//			case 3 :
//				System.err.println("프로그램을 종료합니다.");
//				execute = !execute;
//				break;
//			default :
//				System.err.println("잘못된 값을 입력받았습니다. 다시 입력해 주세요.");
//				break;
//			}
//		}
		
		//test용도
		stack.push("A");
		stack.printStack();
		
		stack.push("B");
		stack.printStack();
		
		stack.pop();
		stack.printPopValue();
		
		stack.push("C");
		stack.printStack();
		
		stack.pop();
		stack.printPopValue();
		
		stack.pop();
		stack.printPopValue();
		
	}

}
