package part01.sec10.exam01;

import java.util.Scanner;

public class Ex06_12 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.print("¸î ´Ü?");
		int dan=s.nextInt();
		
		int i;
		
		for(i=1;i<=9;i++) {
			
		//	System.out.println(i);
			System.out.printf("%d X %d= %d\n",dan,i,dan*i);
			s.close();
		}	
		
	}

}
