package part01.sec10.exam01;

import java.util.Scanner;

public class Ex06_11 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int i;
		int hap=0;
		for(i=num1;i<=num2;i+=num3) {
			               // i+num3
			hap+=i;
	    System.out.println(hap); 
	    s.close();
		}
		
		
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합:%d\n",num1,num2,num3,hap);
		
       
	}

}
