package part01.sec01.exam01;

import java.util.Scanner;

public class Exam_10_1 {

	public static void main(String[] args) {
//		char grade;
//		Scanner s=new Scanner(System.in);
//		
//		int score=s.nextInt();
//		
//		switch(score/10) { //������ ������ ex)100/10=10 ,95/10=9.~~~~~ 
//		case 10:
//		case 9:
//		 grade='A'; // ���� = 'A'
//		 //System.out.println("������"+grade+"�Դϴ�"); �ݺ��̴ϱ� switch �ۿ��� �ѹ���ó��
//		 break;
//		case 8:
//		 grade='B';
//		 //System.out.println("������"+grade+"�Դϴ�");
//		 break;
//		case 7:
//	     grade='C';
//	    //System.out.println("������"+grade+"�Դϴ�");
//	     break;
//		case 6:
//		 grade='D';
//		//System.out.println("������"+grade+"�Դϴ�");
//		 break;
//		 
//		default:
//		 grade='F';
//		 //System.out.println("������"+grade+"�Դϴ�");
//		 		
//		}
//		System.out.println("������"+grade+"�Դϴ�");
//		s.close();
		
		Scanner s=new Scanner(System.in);
		int a =s.nextInt();
		
		switch(a/10) {
		
		case 10:
		case 9:
		System.out.println("������ A�Դϴ�.");
		break;
		case 8:
		case 7:
		System.out.println("������ B�Դϴ�.");
		break;
		case 6:
		case 5:
		System.out.println("������ C�Դϴ�.");
		break;
		case 4:
		System.out.println("������ D�Դϴ�.");
		break;
		case 3:
		System.out.println("������ F�Դϴ�.");
		break;
		default:
		System.out.println("�����");
		
	}
		s.close();
		
	}

}
