package part01.sec01.exam02;

import java.util.Scanner;
//���丮��: 1���� �ڱ��ڽ��Ǽ����� ���س����°�
public class Exam_04 {

	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        
	        System.out.print("���丮��  ���� �Է� : ");
	        int su=s.nextInt();
	        
	        int res=factorial(su);
	        
	        System.out.println(su+"�� ���丮�� �� : "+res);

	}
	
	public static int factorial(int su) {
		
		
		
		if(su==1) {                      
			return 1;
		     }
		return su*factorial(su-1);
	 
	}

}
