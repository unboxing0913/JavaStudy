package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//배열        //new => 메모리의 무언가 새로운것을 만든다.
		int[] aa=new int[4]; //0,1,2,3 = 4개  
		//int aa[]=new int[4]; 이것도 가능
		int hap;
		
		System.out.print("1번째 숫자를 입력하세요: ");
		aa[0]=s.nextInt(); //0부터시작 배열은항상 위치로접근 명심
		System.out.print("2번째 숫자를 입력하세요: ");
		aa[1]=s.nextInt();
		System.out.print("3번째 숫자를 입력하세요: ");
		aa[2]=s.nextInt();
		System.out.print("4번째 숫자를 입력하세요: ");
		aa[3]=s.nextInt();
		
		hap=aa[0]+aa[1]+aa[2]+aa[3];
		
		System.out.printf("합계==>%d\n",hap);
	    //만약 100개의 변수에 저장한다면?
		s.close();

	}

}
