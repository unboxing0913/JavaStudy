package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
         
		System.out.print("## 교환할돈은? :");
		int don = s.nextInt();
		int c500,c100,c50,c10;
		
		
		c500 = don/500;
		System.out.printf("오백원짜리==>%d개\n",c500);
		don = don%500;
		c100 = don/100;
		System.out.printf("백원짜리==>%d개\n",c100);
		don = don%100;
		c50 = don/50;
		System.out.printf("오십원짜리==>%d개\n",c50);
		don = don%50;
		c10 = don/10;
		System.out.printf("십원짜리==>%d개\n",c10);
		don = don%10;
		System.out.printf("바꾸지못한 잔돈==>%d개\n",don);
		s.close();
	}

}
