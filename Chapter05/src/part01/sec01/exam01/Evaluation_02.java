package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("����(1),����(2),��(3)�� �ϳ��� �Է��ϼ���.=>");
		
		
		int use = s.nextInt();		
		System.out.printf("����� %d�Դϴ�.\n",use);
		
		int com = (int)(Math.random()*3)+1;//�����߻� 0~0.999999999
		System.out.printf("���� %d�Դϴ�.\n",com);
		
		
		
		switch(use-com) {
		
		case 2:
			System.out.print("�����ϴ�.");
			break;
		case 1:
			System.out.print("�̰���ϴ�.");
			break;
		case -1:
			System.out.print("�����ϴ�.");
			break;
		case -2:
			System.out.print("�̰���ϴ�.");
			break;		
		default:
			System.out.print("�����ϴ�.");
		}
		 s.close();

	}

}
