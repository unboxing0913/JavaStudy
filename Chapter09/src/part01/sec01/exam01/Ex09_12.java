package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_12 {
	            //��ȯŸ��      //�޼ҵ�         (/�Ű�����)
	public static int coffee_machine(int button) {
		System.out.println("\n#1.(�ڵ����� )�߰ſ� ���� �غ��Ѵ�");
		System.out.println("\n#2.(�ڵ����� )�������� �غ��Ѵ�");
		
		
		switch(button) {
		case 1:
			System.out.println("#3.(�ڵ�����) ����Ŀ�Ǹ� ź��.");
			break;
		case 2:
			System.out.println("#3.(�ڵ�����)����Ŀ�Ǹ� ź��.");
			break;
		case 3:
			System.out.println("#3.(�ڵ�����)��Ŀ�Ǹ� ź��.");
			break;
		default:
			System.out.println("#3.(�ڵ�����)�ƹ��ų� ź��");
			break;
		}
		
		System.out.println("#4.(�ڵ�����)���� �״´�.");
		System.out.println("#4.(�ڵ�����)��Ǭ���� ��� ���δ�.");
		
		return 0; // ��ȯŸ�� ���缭 ���Ͽ� �ֱ����� �ƹ������� �Է�
	}
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int coffee;
		int ret;
		
		System.out.print("A����,� Ŀ�Ǹ� �帱���?(1.����|2.����|3.��)");
		coffee=s.nextInt();
		ret=coffee_machine(coffee); // return�� 0�ǰ� ��������
		System.out.println("A���� Ŀ�� �����ֽ��ϴ�.");
		
		System.out.print("B����,� Ŀ�Ǹ� �帱���?(1.����|2.����|3.��)");
		coffee=s.nextInt();
		coffee_machine(coffee);
		System.out.print("B���� Ŀ�� �����ֽ��ϴ�.");
		
		System.out.print("C����,� Ŀ�Ǹ� �帱���?(1.����|2.����|3.��)");
		coffee=s.nextInt();
		coffee_machine(coffee);
		System.out.print("C���� Ŀ�� �����ֽ��ϴ�.");
		
		s.close();
	
	}

}
