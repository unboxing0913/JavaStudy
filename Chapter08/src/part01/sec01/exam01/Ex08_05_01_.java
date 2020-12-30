package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_05_01_ {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int intArray[]=new int[5];
		int max=0;
		
		for(int i=0;i<5;i++) {
			intArray[i]=in.nextInt();
			if(intArray[i]>max)
				max=intArray[i];
		}
		System.out.printf("입력된 수에서 가장 큰수는 %d 입니다",max);
		in.close();
	}

}
