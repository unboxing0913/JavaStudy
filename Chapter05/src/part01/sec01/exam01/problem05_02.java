package part01.sec01.exam01;

import java.util.Scanner;
//
public class problem05_02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("ù��° ���� �Է��ϼ���.");
		int a = s.nextInt();
		System.out.print("����� �����ڸ� �Է��ϼ���: ");
		char ch = s.next().charAt(0);
		
		System.out.print("�ι�° ���� �Է��ϼ���.");
		int b = s.nextInt();

		
		if (ch == '+') { 
			System.out.printf("%d+%d=%d�Դϴ�.", a, b, a + b);
		} 
		else if (ch == '-') {
			System.out.printf("%d-%d=%d�Դϴ�.", a, b, a - b);
		} 
		else if (ch == '*') {

			System.out.printf("%d*%d=%d�Դϴ�.", a, b, a * b);
			System.out.println("���κ��ұ��?");
		} 
		else  if(ch == '/') {
			System.out.printf("%d/%d=%f�Դϴ�.", a, b, a /(float) b);
		}
		else
			System.out.print("�����ڸ� �߸��Է��߽��ϴ�.\n");
		//System.out.println("���κ��ұ��?");
		
		s.close();
		

	}
}
