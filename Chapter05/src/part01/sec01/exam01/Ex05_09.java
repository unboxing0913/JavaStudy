package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_09 {
       //Switch(����,String)==>switch������ ���Ҽ��ִ´��
	      //�Ǽ����� Switch���� ����Ҽ�����.
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		int a;
//		
//		System.out.print("1~4�߿� �����ϼ���:");
//		a=s.nextInt(); //1~4
//		//����
//		switch(a) { // Ű����� ���� �Է¹����� ()
//		case 1: //case(����)��:
//			System.out.println("1�� �����ߴ�.");
//			break;//����ġ�� ���� �����������. ���ϸ� �ؿ� ��~���� 
//		case 2:
//			System.out.println("2�� �����ߴ�.");
//			break;
//		case 3:
//			System.out.println("3�� �����ߴ�.");
//			break;
//		case 4:
//			System.out.println("4�� �����ߴ�.");
//		    break; 
//		default://�ش��ȣ�������� ���� ~~�޼��� ~~ó�����ϰ�ʹ� �Ҷ� ��
//			System.out.println("�ش��ȣ �����ϴ�.");
//		    }
//		
//		s.close();
		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.print("1~4�߿� �����ϼ���:");
//		int a = s.nextInt();
//		
//		switch(a){//��ȣ��
//		
//		case 1:		
//		System.out.print("1�� �����߽��ϴ�.");
//		        break;//
//		case 2:
//		System.out.print("2�� �����߽��ϴ�.");
//                break;
//		case 3:
//	    System.out.print("3�� �����߽��ϴ�.");
//                break;
//		case 4:
//		System.out.print("4�� �����߽��ϴ�.");
//                break;
//		default:    //�ܿ���
//		System.out.print("�ش��ȣ �����ϴ�.");
//		}
//		s.close();
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("1~4�߿� �����ϼ���:");
		int type =s.nextInt();
		
		switch(type) {
		case 1:
			System.out.println("1�� �����ߴ�.");
			break;
		case 2:
			System.out.println("2�� �����ߴ�.");
			break;
		case 3:
			System.out.println("3�� �����ߴ�.");
			break;
		case 4:
			System.out.println("4�� �����ߴ�.");
			break;
		default:
			System.out.println("�߸��� ���ڸ� �����߽��ϴ�.");
		}
		
			s.close();
			
		
	}

}
