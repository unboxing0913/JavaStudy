package part01.sec01.exam01;

import java.util.Scanner;

public class Problem02_01 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		int result;
	
		Scanner s=new Scanner(System.in);
		
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==>");
		a=s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==>");
		b=s.nextInt();
		System.out.print("����° ����� ���� �Է��ϼ��� ==>");
		c=s.nextInt();
		System.out.print("�׹�° ����� ���� �Է��ϼ��� ==>");
		d=s.nextInt();
		
		result=a+b+c+d;	
		System.out.println(a+"+"+b+"+"+c+"+"+d+"="+result);//��ȣ���ǳ������
		
		
		s.close();
		
		
		
		
	}

}
