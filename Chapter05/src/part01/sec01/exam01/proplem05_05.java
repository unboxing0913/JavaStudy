package part01.sec01.exam01;

import java.util.Scanner;

public class proplem05_05 {

	public static void main(String[] args) {
		
		char gender=' ';  // char Ÿ���� '' �ȿ� �������ϳ� ��� �������ȳ�.
		String regNo=""; // �̰� �ʱ�ȭ��Ų����
		
		System.out.print("����� �ֹε�Ϲ�ȣ�� �Է��ϼ���.(123456-1111111=>");
			
		Scanner s=new Scanner(System.in);	//	
		regNo=s.nextLine();//
		gender = regNo.charAt(7);//

		
//		regNo = s.nextLine(); // ���ڿ� �Է¹�����
//		regNo = 
//		gender = Integer.parseInt(regNo);
//		
		
		
		switch(gender) {
		

		case '1'://
		case '3'://
			System.out.println("����� ���� �Դϴ�.");
            break;
		case '2'://
		case '4'://
			System.out.println("����� ���� �Դϴ�.");
            break;
		
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ �Դϴ�.");
		}
		s.close();
	}

}
