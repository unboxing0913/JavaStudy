package part01.sec01.exam01;

import java.util.Scanner;

public class Exercise05 {
	
	public static void main(String[] args) {
		
		boolean run =true;
		int balance = 0;
		//int don;
		Scanner s = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���� |2.��� |3.�ܰ� |4.����");
			System.out.println("---------------------------------");
			System.out.print("���� > ");
			int num = s.nextInt();
			
			
			switch(num) {
			case 1:
				System.out.print("���ݾ� > ");
				//don = s.nextInt();
				//balance = balance + don;
				balance+=s.nextInt();
			    break;
			case 2:
				System.out.print("��ݾ� > ");
				//don = s.nextInt();
				//balance = balance - don;
				balance-=s.nextInt();
				break;
			case 3:
				System.out.print("�ܰ� > ");
				System.out.println(balance);
				break;
			case 4:
				System.out.println("���α׷� ����.");
				run=false;
				break;
			
			default:
				System.out.println("�߸��Է��߽��ϴ�. �ٽ��Է����ּ���.");
				continue;
			
			}s.close();
		}
		
		
		
	}
}
