package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_09_01__ {

	public static void main(String[] args) {
		
//	    Scanner s=new Scanner(System.in);
//		char grade=s.next().charAt(0);//At(?)<-����Ȱ����� ���� 0���ͽ���~
//	     //next()�� ���ڿ� stringŸ������ ����  	
//	    //next()�� ���ڿ�Ÿ������ ������ ���ڿ�Ÿ���� �Ǿ� At(0) ���� �Ǿ��� ���ڿ��� �״�� ���
//	    switch(grade) {
//	    case 'A'://���ڵ���ǥ
//	    	//System.out.println("�� ���Ͽ����ϴ�.");
//	        //break;
//	    case 'B':
//	    	System.out.println("�� ���Ͽ����ϴ�.");
//	    	break;
//	    case 'C':
//	    	//System.out.println("�� �� ����ϼ���.");
//	    	//break;
//	    case 'D':
//	    	System.out.println("�� �� ����ϼ���.");
//	    	break;
//	    case 'F':
//	        System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
//	        break;
//	    
//	    default:
//	    	System.out.println("�߸��� �����Դϴ�.");
//	    }
//	    s.close();
		
		Scanner s=new Scanner(System.in);
		char sco=s.next().charAt(0); //char ���� �ϳ������� 
		      // ��ĳ�� next string ���ι��� ���ڿ��� charAf�� �����ϳ��� �޾ƿ�
		
		switch(sco) {
		case 'A': 
			System.out.println("�� ���޽��ϴ�.");
			break;
		case 'B': 
			System.out.println("�ʹ��ƽ��׿�.");
			break;
		case 'C': 			
		case 'D': 
			System.out.println("���� ����ϼ���");
			break;
		case 'F': 
			System.out.println("�����б⿡ ������ϼ���.");
			break;
		default:	
			System.out.println("�߸��� ���Դϴ�.");
		}
		
		s.close();
		
		
		
	}
}
	


