package part01.sec01.exam01;
//문자열 거꾸로 출력시키기
import java.util.Scanner;

public class Problem09_01 {

	public static void main(String[] args) {               // 방법 많음 둘다 됨 
		Scanner s=new Scanner(System.in);
//		String str;
//		String tt="";
//		System.out.print("문자열을 입력하세요 : ");
//		str=s.nextLine();
//	
//		for(int i=0;i<str.length();i++) { 
//			
//			
//			tt+=str.charAt((str.length()-1)-i);        //위치 때문에 시간좀걸렸음
//	      
//			
//	 			
//	     }System.out.print("내용을 거꾸로 출력 ==>"+tt);
//			
//	 		s.close();
	 		
	 ////////////////////////////////////////////////////////////////////////////////////////////		
	 	 String ss;
	 	 String tt=""; // 누적은 초기화가되어있어야함
	 	 int count,i;
	 	 
	 	 System.out.printf("문자열을 입력하세요:");
	 	 ss=s.nextLine();
	 	 
	 	 count=ss.length();
		
	 	 for(i=0;i<count;i++) {
	 		 tt+=ss.charAt(count-(i+1));
	 	 }
	 	  System.out.printf("내용을 거꾸로 출력==>%s\n",tt);
	 	 s.close();
	 	}
		
		

	}



