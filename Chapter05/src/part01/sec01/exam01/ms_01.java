package part01.sec01.exam01;

import java.util.Scanner;

public class ms_01 {

	public static void main(String[] args) {
		 
		Scanner s=new Scanner(System.in);
		
		System.out.print("������ �� �ٷ� ����� �Է� :");//�Է¸����ް� �����ٲ�
		int a,b;
		String[] ex ;
		
		ex =s.nextLine().split(" ");//���ڿ����ް� �迭�� " " �� ������
	    
		a = Integer.parseInt(ex[0]);
		
	    char chr = ex[1].charAt(0);
				
	    b = Integer.parseInt(ex[2]);
		
		
		
		
		switch(chr){
			case '+':{
			    int result = a+b;
				System.out.printf("%d+%d=%d�Դϴ�.",a,b,result);
				break;}
			case '-':{
			    int result = a-b;
				System.out.printf("%d-%d=%d�Դϴ�.",a,b,result);
				break;}
			case '*':{
			    int result = a*b;
				System.out.printf("%d*%d=%d�Դϴ�.",a,b,result);
				break;}
			case '/':{
			    int result = a/b;
				System.out.printf("%d/%d=%f�Դϴ�.",a,b,(float)result);
				break;}
			default :
				System.out.print("�߸� �Է��ϼ̽��ϴ�.");
				
				s.close();
					
		}
		  
		

	}

}
