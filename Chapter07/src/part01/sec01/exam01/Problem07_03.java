package part01.sec01.exam01;

import java.util.Scanner;

public class Problem07_03 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
         
		String str;
		char ch;
		int i,k;
		int star;
		
		System.out.print("숫자를 여러 개 입력 : ");
		str=s.nextLine(); //문자열입력
		
		
		i=0;	
		ch = str.charAt(0);//0번째위치 //ex)'1'(49) 2(50)3(51)4(52)5(53) 0(48) //()<== 아스키코드값
		
		while(true) {
		    star=ch-48; // 숫자1을만들어주기위해서 48을뺌 star값을구해주기위해서 위에ch주고
		         //연산이라 4byte 처리됨
		    for(k=0;k<star;k++) {
		    	
		    	System.out.print("*");	
		    }
		        
		        
		     
		      i++;//읽기전에증가시켜주면됨
		     if(i>str.length()-1) { // 데이터접근 방법을 위치로 접근 ex) 10개 =>0~9 //이해하기
		    	 break;
		     }ch = str.charAt(i);//위에 (0) 은 숫자1을 만들어주기위해서 준거기때문에 증가시킬 명령문 한번 더 입력
		     
		   System.out.println();
		   s.close();
		}
		
		
	}

}

//Scanner 사용
// 반복문while(true)사용
//for문 사용 , if문 사용,break 사용
// 문자열을 저장할 변수   String str
// 입력되는 값은 문자열로 처리되므로 숫자로 바꾸어 주어야 한다.
//흰트 => 아스키코드표를보면 문자1이 숫자로 얼마에 표시가될것 바꾼값을 star라는 정수형 변수에 저장 //문자1 숫자49번