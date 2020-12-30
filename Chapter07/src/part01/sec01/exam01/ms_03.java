package part01.sec01.exam01;

import java.util.Scanner;

public class ms_03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		char ch;
		int star;
		int i=0;
		
		System.out.print("숫자를 여러개 입력 : ");//ex)4개
		String str=s.nextLine();
		ch=str.charAt(0);
		
		while(true) {
			star=ch-48; //문자1의값 즉 49를 숫자 1의값을만들어주려고
									
	     	
		 for(int k=0;k<star;k++) {//0->1될때까지 1번반복 i값이증가하면서 증가반복
			 System.out.print("*");			 
		 }
		   i++;//중지if문에 값을 올려야하기때문에 입력한숫자가 제때 넘어갈때 break 해줘야해서
		
		 if(i>str.length()-1) {//length()=>4-1=3   ex)0,1,2,3 =>4개
			 break;
			 
		 }  
		   
		    ch=str.charAt(i); //ch값을 증가하게 하기위한 코드
				
								
          System.out.println();
		}

	}
}

////////////////////////////////////////////////////
//String str;
//char ch;
//int i,k;
//int star;
//
//System.out.print("숫자를 여러 개 입력 : ");
//str=s.nextLine(); //문자열입력
//
//
//i=0;	
//ch = str.charAt(0);//0번째위치 //ex)'1'(49) 2(50)3(51)4(52)5(53) 0(48) //()<== 아스키코드값
//
//while(true) {
//    star=ch-48; // 숫자1을만들어주기위해서 48을뺌 star값을구해주기위해서 위에ch주고
//         //연산이라 4byte 처리됨
//    for(k=0;k<star;k++) {
//    	
//    	System.out.print("*");	
//    }
//        
//        
//     
//      i++;//읽기전에증가시켜주면됨
//     if(i>str.length()-1) { // 데이터접근 방법을 위치로 접근 ex) 10개 =>0~9 //이해하기
//    	 break;
//     }ch = str.charAt(i);//위에 (0) 은 숫자1을 만들어주기위해서 준거기때문에 증가시킬 명령문 한번 더 입력
//     
//   System.out.println();
//   s.close();
