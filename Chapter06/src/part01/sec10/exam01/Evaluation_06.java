package part01.sec10.exam01;

import java.util.Scanner;

public class Evaluation_06 {

	public static void main(String[] args) {
		 
		Scanner s=new Scanner(System.in);
		 
		 System.out.print("글자를입력 :");
		 int i;
		 String str = s.next();
		 int a = str.length(); // 0 1 2 3 4 ==>5글자
		 
		 
		 System.out.println("입력한문자==>"+str);
		 
		 System.out.print("변경된문자==>");
		                       // 5 4 3 2 1
		 for(i=a-1;i>=0;i--) { //5 4 3 2 1 0 ==>6이기때문에 -1 해줌 
			 System.out.printf("%c",str.charAt(i));
			 s.close();
		     
		 } 
		
		
		
}	
}
