package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_18 {  //시간날때 오류 바꾸기

	public static void main(String[] args) {
	      Scanner s=new Scanner(System.in);
	      
	       System.out.print("인원수를 입력");		   
	       int inwon=s.nextInt();
	       
	       String name[]=new String[inwon];//인원수 만큼만 배열만들기
		   
		   for(int i=0;i<name.length;++i){      
		      System.out.print(i+1+"번째 이름: ");
		      name[i]=s.next(); // nextLine을썻을때 엔터키까지 입력되기때문에 next를 사용
		   } 
		   for(int i=0;i<name.length;i++){      
			      System.out.println(i+1+"번째 이름은"+name[i]+"님 입니다.");
			      
			   } 
		      s.close();
		   
		   		   		   
		
		
	}

}
