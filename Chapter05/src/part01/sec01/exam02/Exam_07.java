package part01.sec01.exam02;

import java.util.Scanner; // 100���� ū��� 100���� ������� 100�ΰ��

public class Exam_07 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("�Է��� �� : ");
		int a = s.nextInt();

		if (a == 100)
			System.out.print("�Է��Ͻ� ���� 100�Դϴ�.");
		else if (a > 100)
			System.out.print("�Է��Ͻ� ���� 100���� Ů�ϴ�.");
		else 
			System.out.print("�Է��Ͻż��� 100���� �۽��ϴ�.");

		s.close();
		
//		 Scanner s=new Scanner(System.in);
//		 
//		 System.out.print("�Է��� ��:");
//		 int a =s.nextInt();
//		 
//		 if(a>100) {
//		 System.out.println("�Է��Ͻż��� 100����Ů�ϴ�.");
//		 }else if(a<100) {
//		 System.out.println("�Է��Ͻż��� 100�����۽��ϴ�.");
//		 }else {
//		 System.out.println("�Է��Ͻż��� 100�Դϴ�.");
//		 }
//		 s.close();
	}

}
