package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
         
		System.out.print("## ��ȯ�ҵ���? :");
		int don = s.nextInt();
		int c500,c100,c50,c10;
		
		
		c500 = don/500;
		System.out.printf("�����¥��==>%d��\n",c500);
		don = don%500;
		c100 = don/100;
		System.out.printf("���¥��==>%d��\n",c100);
		don = don%100;
		c50 = don/50;
		System.out.printf("���ʿ�¥��==>%d��\n",c50);
		don = don%50;
		c10 = don/10;
		System.out.printf("�ʿ�¥��==>%d��\n",c10);
		don = don%10;
		System.out.printf("�ٲ������� �ܵ�==>%d��\n",don);
		s.close();
	}

}
