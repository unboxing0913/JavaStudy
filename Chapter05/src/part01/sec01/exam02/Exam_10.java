package part01.sec01.exam02;

import java.util.Scanner;

//������ ���� �Է� 3��5�ǹ�� . 3�ǹ�� 5�ǹ�� 3��5�ǹ�� 
public class Exam_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("������ ���� �Է� : ");
		int a = s.nextInt();

		if (a % 3 == 0 && a % 5 == 0) // ������ �Ѵ� �����ϱ����� �������� AND ���
			System.out.println("�Է��Ͻż��� 3�� 5�� ����Դϴ�.");
		else if (a % 3 == 0)
			System.out.println("�Է��Ͻż��� 3�� ����Դϴ�.");
		else if (a % 5 == 0)
			System.out.println("�Է��Ͻż��� 5�ǹ���Դϴ�.");

		s.close();

//		Scanner s=new Scanner(System.in);
//		
//		System.out.print("������ ���� �Է�: ");
//		int a=s.nextInt();
//		
//		if(a%3==0 && a%5==0) {
//			System.out.println("�Է��Ͻ� ���� 3�� 5�� ����Դϴ�.");
//		}else if(a%3==0) {
//			System.out.println("�Է��Ͻż��� 3�ǹ���Դϴ�.");
//		}else if(a%5==0) {
//			System.out.println("�Է��Ͻż��� 5�ǹ���Դϴ�.");
//		}else {
//			System.out.println("�Է��Ͻż��� 3�Ǵ� 5�ǹ���� �ƴմϴ�.");
//		}
//	      s.close();
	}

}
