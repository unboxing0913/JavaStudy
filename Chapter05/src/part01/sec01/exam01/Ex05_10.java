package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_10 {
// �� �� �� �� �� �� ȣ �� �� �� �� �� (�ٽ�)
   
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int year;
		
		System.out.println("��������� �Է��ϼ���:");
		year =s.nextInt();
		
		switch(year%12){//12����
		case 0:
			System.out.printf("�����̶�\n");
			break;
		case 1:
			System.out.printf("�߶�\n");
			break;
		case 2:
			System.out.printf("����\n");
			break;
		case 3:
			System.out.printf("������\n");
			break;
		case 4:
			System.out.printf("���\n");
			break;
		case 5:
			System.out.printf("�Ҷ�\n");
			break;
		case 6:
			System.out.printf("ȣ���̶�\n");
			break;
		case 7:
			System.out.printf("�䳢��\n");
			break;
		case 8:
			System.out.printf("���\n");
			break;
		case 9:
			System.out.printf("���\n");
			break;
		case 10:
			System.out.printf("����\n");
			break;
		case 11:
			System.out.printf("���\n");			
		
		}
           s.close();
		
		
	}

}
