package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c,d;
		int hap;
		
		System.out.print("1��° ���ڸ� �Է��ϼ���: ");
		a=s.nextInt();
		System.out.print("2��° ���ڸ� �Է��ϼ���: ");
		b=s.nextInt();
		System.out.print("3��° ���ڸ� �Է��ϼ���: ");
		c=s.nextInt();
		System.out.print("4��° ���ڸ� �Է��ϼ���: ");
		d=s.nextInt();
		
		hap=a+b+c+d;
		
		System.out.printf("�հ�==>%d\n",hap);
	    //���� 100���� ������ �����Ѵٸ�?
		s.close();

	}

}
