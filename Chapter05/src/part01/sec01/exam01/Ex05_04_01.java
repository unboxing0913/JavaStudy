package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_04_01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("���� �Է��Ͻÿ�:");
		int a = s.nextInt();
		if (a % 3 == 0)// 3�ǹ���� 3���γ������� 0 ==> �������� ������ ������0��ã���� 3�ǹ��
						// a��3���� �������� ������0 3�ǹ�� ���߱�������� %%%%%%
			System.out.println("3�� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");
		
        s.close();
		
//		Scanner s = new Scanner(System.in);
//		int a =s.nextInt();
//		
//		if(a%3==0) {
//				System.out.printf("3�ǹ���� �½��ϴ�.");
//		}else
//		System.out.printf("3�ǹ���� �ƴմϴ�.");
//        s.close();
	}

}
