package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;

		System.out.print("������ �Է��ϼ���:");
		a = s.nextInt();

		if (a % 2 == 0) { //2�ǹ���� ���� ¦��
			System.out.println("¦���� �Է��߱���..");
		} else {
			System.out.println("Ȧ���� �Է��߱���..");
		}
		s.close();
		
//		Scanner s=new Scanner(System.in);
//			
//		System.out.print("������ �Է��ϼ���:");
//		int a=s.nextInt();
//		
//		if(a%2==0)
//		System.out.print("¦���� �Է��߱���");
//		else
//		System.out.print("Ȧ���� �Է��߱���");
//
//		s.close();
	}
}
