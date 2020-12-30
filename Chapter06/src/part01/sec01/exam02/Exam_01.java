package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int su;
		 int i;
		 System.out.print("임의의 수를 입력:");
		 su=s.nextInt();
         
		 System.out.print(su+"의 약수:"); // 약수 : 나누어 떨어지는수
		 
		 for(i=1;i<=su/2;i++) { //다시풀어보기
			              //
			 if(su%i==0) {
				 			  
			 System.out.print(i+",");
		 } s.close();
		 
		 }
             System.out.println(su);//자기자신 마지막 포함. 
            
	}

}
