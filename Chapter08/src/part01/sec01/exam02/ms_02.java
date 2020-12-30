package part01.sec01.exam02;

import java.util.Scanner;

public class ms_02 {


	public static void main(String[] args) {
	  
		 @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in); //의문)스캐너 닫았는데 왜 오류나는지	
		 
		 int i;
		 int inwon;
		 
		 
		 System.out.print("인원수를 입력 : ");	 
		 inwon = s.nextInt();
		 String name[]=new String[inwon]; //인원수만큼의 배열생성하기위함 
		                                   // ex)인원수5 배열[5] 0,1,2,3,4
		
		 
		 for(i=0;i<name.length;i++) { //의문)name.length의 값=>배열.length는 배열의 갯수 
		  		  
		  System.out.printf("%d번째 이름:",i+1);
		  name[i]=s.next();		  
		  
		 }
		 for(i=0;i<name.length;i++) {
			 System.out.printf("%d번째 이름은 %s님 입니다.\n",i+1,name[i]);//의문)위의 for문에서 반복하지않는이유
			                                                         //숫자쓰고 이름쓰고 출력 이름쓰고출력이라
		 }
		  
		 s.close();
		
	}

}
