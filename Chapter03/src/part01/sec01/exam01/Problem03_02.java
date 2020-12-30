package part01.sec01.exam01;

import java.util.Scanner;

public class Problem03_02 {

	public static void main(String[] args) {
		//클래스는 기능
		
	   Scanner s=new Scanner(System.in);
	   int type,data=0;//0을주는이유 -> 1,2,3 선택안했을때 초기화0
	   
	   String str; // 문자열 받기 위해서4
	   
	   System.out.printf("입력진수 결정<1>10 <2>16 <3>8 :"); //제목
	   type=s.nextInt(); // 1,2,3 의 선택지
	   
	   System.out.printf("값 입력:");//제목
	  
	   if(type == 1) {
		   str=s.next(); // 공백을 끝으로 입력 1 0(문자열) // (nextInt는 정수받을때만) 
	       data=Integer.parseInt(str, 10);//값을 10진수로바꿔주겠다
	             //Integer클래스의 기능은 parseInt(값,진수) 로 바꿔주는기능
	      
		    }   
     
	   if(type == 2) {
    	   str=s.next(); 
    	   data=Integer.parseInt(str, 16);//값을16진수로바꿔주겟다
    	   
       }
            
     
	   if(type == 3) {
    	   str=s.next(); 
    	   data=Integer.parseInt(str, 8);//값을8진수로바꿔주겠다.
            }
       
       
	    System.out.printf("10진수 ==> %d\n",data);
		System.out.printf("16진수 ==>%X\n",data); 
		System.out.printf("8진수 ==> %o\n",data);
	
       
      s.close();
		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.print("입력진수 결정<1>10 <2>16 <3>8 :");
//		int result,data = 0;//
//		result = s.nextInt();
//		String str;//
//		System.out.print("값 입력: ");
//				
//		if (result == 1) {
//			str=s.next();//
//			data = Integer.parseInt(str,10);
//			}else if(result ==2) {
//				str=s.next();//
//				data = Integer.parseInt(str,16);
//			}else if(result ==3) {
//				str=s.next();//
//				data = Integer.parseInt(str,8);
//			}
//		  s.close();
//			
//		System.out.printf("10진수 ==> %d\n",data);//
//		System.out.printf("16진수 ==> %x\n",data);//
//		System.out.printf("24진수 ==> %o\n",data);//
	
				
}
}