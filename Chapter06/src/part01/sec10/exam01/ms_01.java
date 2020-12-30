package part01.sec10.exam01;

import java.util.Scanner;

public class ms_01 {

	public static void main(String[] args) {
		//반복문 for 사용
		// 입력한 문자열을 반대로 출력
		Scanner s=new Scanner(System.in);	                  
        String str;
        int str_cnt;
        int i;
		
		System.out.print("글자를 입력:");      
        str=s.nextLine();
        
        System.out.printf("입력한 문자열==>%s\n",str);
        
        System.out.print("변환된 문자열==>");
        str_cnt = str.length();
        
        for(i=str_cnt-1;i>=0;i--) {//  01234
        	//정수를 문자로 변환어케시키지
        	System.out.printf("%c",str.charAt(i));//0받아오고1받아오고2받아오고 각각
        	s.close();
        }
        
        
	}

}
