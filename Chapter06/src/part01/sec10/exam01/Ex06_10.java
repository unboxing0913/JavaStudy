package part01.sec10.exam01;

import java.util.Scanner;

public class Ex06_10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num;
		int hap = 0;
		int i = s.nextInt();

		for (num = 1; num <= i; num++) {

			hap += num;// hap=hap+num;
			s.close();
		}
		//num = i;
		//System.out.printf("1에서 %d까지의 합:%d\n", num, hap);
		System.out.printf("1에서 %d까지의 합:%d\n", i, hap);
		

	}

}
