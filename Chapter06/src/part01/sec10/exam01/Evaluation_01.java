package part01.sec10.exam01;

import java.util.Scanner;

public class Evaluation_01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("임의의 수를 입력: ");
		int su = s.nextInt();
		int i;
		
		System.out.print(su+"의 약수:");
		for(i=1;i<=su/2;i++) {
			 if(su%i==0) {
			System.out.print(i+",");
			
	     }
			 s.close();
         } System.out.print(su);
          
        
}
}