package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_01 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		
		

		System.out.print("ù��° �Ի��� ���� �Է��ϼ���==>");
		int a = s.nextInt();
		System.out.print("�ι�° �Ի��� ���� �Է��ϼ���==>");
		int b = s.nextInt();
		System.out.print("����° �Ի��� ���� �Է��ϼ���==>");
		int c = s.nextInt();
		System.out.print("�׹�° �Ի��� ���� �Է��ϼ���==>");
		int d = s.nextInt();		
		
		int result = a+b+c+d;
	    System.out.printf("%d+%d+%d+%d=%d",a,b,c,d,result);
	    
	    s.close();
		
	}

}
