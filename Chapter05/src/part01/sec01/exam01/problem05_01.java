package part01.sec01.exam01;

import java.util.Scanner;

public class problem05_01 {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//
//		System.out.print("ù��° ���� �Է��ϼ���.");
//		int a = s.nextInt();
//		System.out.print("����� �����ڸ� �Է��ϼ���: ");
//		// System.out.printf("����� �����ڸ� �Է��ϼ���: "); �Ѵٵ� print , printf
//		char ch = s.next().charAt(0);
//		
//		System.out.print("�ι�° ���� �Է��ϼ���.");
//		int b = s.nextInt();
//
//		
//		if (ch == '+') { // ���� ����ǥ
//			System.out.printf("%d+%d=%d�Դϴ�.", a, b, a + b);
//		} 
//		if (ch == '-') {
//			System.out.printf("%d-%d=%d�Դϴ�.", a, b, a - b);
//		} 
//		if (ch == '*') {
//
//			System.out.printf("%d*%d=%d�Դϴ�.", a, b, a * b);			
//		} 
//		if (ch == '/') {
//			System.out.printf("%d/%d=%f�Դϴ�.", a, b, a /(float) b);//�������� �����Ǽ�
//		}
//         //if���� ó�����ͺ��ؼ� ���ΰ��� ����ϴ°�
//		s.close();
		
//		Scanner s=new Scanner(System.in);
//		int reslut;
//		System.out.println("ù��° ���� �Է��ϼ���.");
//		int a=s.nextInt();
//						
//		System.out.println("����� �����ڸ� �Է��ϼ���:");
//		char str = s.next().charAt(0); //
//		
//		System.out.println("�ι�° ���� �Է��ϼ���.");
//		int b=s.nextInt(); // �����߿��� �ڵ��� ������ ������ �Ʒ��� ....
//		
//		if(str=='+') {
//			reslut=a+b;
//			System.out.println(a+"+"+b+"="+reslut+"�Դϴ�.");
//		}else if(str=='-') {
//			reslut=a-b;
//			System.out.println(a+"-"+b+"="+reslut+"�Դϴ�.");
//		}else if(str=='*') {
//			reslut=a*b;
//			System.out.println(a+"*"+b+"="+reslut+"�Դϴ�.");
//		}else if(str=='/') {
//			reslut=a/b;
//		    System.out.println(a+"/"+b+"="+reslut+"�Դϴ�.");
//		}
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("ù��° �����Է��ϼ���.");
		int a = s.nextInt();
		System.out.print("����� �����ڸ� �Է��ϼ���.");
		char su =s.next().charAt(0);
		System.out.print("�ι�° �����Է��ϼ���.");
		int b = s.nextInt();
		
		if (su=='+') {
			System.out.print(a+"+"+b+"="+(a+b)+"�Դϴ�");
		}else if (su=='-') {
			System.out.print(a+"-"+b+"="+(a-b)+"�Դϴ�");
		}else if (su=='*') {
			System.out.print(a+"*"+b+"="+(a*b)+"�Դϴ�");
		}else if (su=='/') {
				System.out.print(a+"/"+b+"="+((float)a/b)+"�Դϴ�");
		}else {
			System.out.print("�߸��� �����Դϴ�.");
		}
		 s.close();
		
	}
}
/* 1)Ŭ������ �̸�:Problem05_01
   2) Scanner Ŭ���� ���
   3) ������ ������ �ΰ��Է¹޾� ��������� ���� ����ϼ���
   4) if�� ���(+,-,*,/ ��Ģ�����)

ù��° ���� �Է��ϼ��� :10
����� �����ڸ� �Է��ϼ��� : *
�ι�° ���� �Է��ϼ��� : 20
10*20=200�Դϴ�.*/