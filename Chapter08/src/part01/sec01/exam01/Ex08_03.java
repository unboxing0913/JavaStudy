package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		//배열 for문사용
		int[] aa=new int[4];
		
		int hap;
		int i;
		
		for(i=0;i<=3;i++) {
			System.out.printf("%d번째 숫자를 입력하세요:",i+1); //+1이유는 제목찍어주기위해서
			aa[i]=s.nextInt(); 
		}		//i는 지금 [0],[1],[2],[3]
		   
		   
		   hap=aa[0]+aa[1]+aa[2]+aa[3];
		   System.out.printf("합계==>%d\n",hap);
		   
		   s.close();
	   
		   

	}

}
