package stack;

import java.util.Scanner;

/**
 * �ϼ��� Stack �׽�Ʈ�� Main
 * @author karzin
 *
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Karzin-Stack");
		System.out.println("");
				
		Stack stack = new Stack();
		
//		���� ���� �����鼭 �׽�Ʈ �غ��� �ʹٸ� �Ʒ� �ּ��� Ǯ�� 44������ 60������ �ּ�ó��
//		boolean execute = true;
//		
//		while(execute) {
//			System.out.println("1 : push, 2 : pop, 3 : ����");
//			System.out.print("���ϴ� �۾��� �Է����ּ��� : ");
//			Scanner s = new Scanner(System.in);
//			switch(s.nextInt()) {
//			case 1 :
//				System.err.print("Push �� �Է� : ");
//				Scanner value = new Scanner(System.in);
//				String pushValue = value.nextLine();
//				stack.push(pushValue);
//				stack.printStack();
//				break;
//			case 2 :
//				System.err.println("Pop ����");
//				stack.pop();
//				stack.printPopValue();
//				break;
//			case 3 :
//				System.err.println("���α׷��� �����մϴ�.");
//				execute = !execute;
//				break;
//			default :
//				System.err.println("�߸��� ���� �Է¹޾ҽ��ϴ�. �ٽ� �Է��� �ּ���.");
//				break;
//			}
//		}
		
		//test�뵵
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
