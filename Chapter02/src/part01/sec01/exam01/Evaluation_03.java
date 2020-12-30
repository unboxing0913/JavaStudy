package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_03 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.print("이름을 입력:");
		String name = s.next();
		
		System.out.print("국어점수를 입력:");
		int sco = s.nextInt();
		
		System.out.print("영어점수를 입력:");
        int	sco2 = s.nextInt();	
		
        int result = sco+sco2;
		System.out.printf("%s님의 총점수는 %d점 입니다.",name,result);

        s.close();		
	}

}
