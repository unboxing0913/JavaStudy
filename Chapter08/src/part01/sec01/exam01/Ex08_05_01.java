package part01.sec01.exam01;

import java.util.Scanner;

//키보드에서 입력받은 양수5개를 배열에 저장하고 제일 큰수를 화면에 출력하는 프로그램만들기
public class Ex08_05_01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int su[]=new int[5];
		int big=0;
		
		for(int i=0;i<5;i++) {		
	     su[i]=s.nextInt();
	     
		if(su[i]>big) {
		     big=su[i];			
		
		   }
		}
		System.out.printf("입력된 수에서 가장 큰수는 %d 입니다",big);
		

		
	} 

}

