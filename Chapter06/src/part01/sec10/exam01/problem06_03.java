package part01.sec10.exam01;

import java.util.Scanner;

public class problem06_03 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str;
		int str_cnt;//문자열의 갯수를 체크하는 변수
		int i;
		
		System.out.printf("글자를 입력:");
        str=s.nextLine(); // 문자열 가져옴
        
        System.out.printf("\n");
        
        System.out.printf("입력한 문자열 ==>%s\n",str); 
        
        
        
        
        
        System.out.printf("변환된 문자열====>");
        
        str_cnt = str.length(); // string 클래스가 가지고있는 문자의 길이를 가져오는 명령어
        
        for(i=str_cnt-1;i>=0;i--) {//-1해주는이유 : 012345 총6글자니깐 -1글자빼줌. 
 
        	 System.out.printf("%c",str.charAt(i)); // abcde를 -- 시켜서 => edcba 
             	       s.close();   		
        	}
    
        
         
}
}

//반복문 for 사용
// 입력한 문자열을 반대로 출력