package part01.sec01.exam02;

import java.util.Scanner;
//팩토리얼: 1부터 자기자신의수까지 곱해나가는것
public class Exam_04 {

	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        
	        System.out.print("팩토리얼  수를 입력 : ");
	        int su=s.nextInt();
	        
	        int res=factorial(su);
	        
	        System.out.println(su+"의 팩토리얼 값 : "+res);

	}
	
	public static int factorial(int su) {
		
		
		
		if(su==1) {                      
			return 1;
		     }
		return su*factorial(su-1);
	 
	}

}
