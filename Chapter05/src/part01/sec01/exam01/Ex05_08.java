package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_08 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int a;
//
//		System.out.print("점수를 입력하세요:");
//		a = s.nextInt();
//
//		if (a >= 90) // 어차피 if는 하나만 출력
//			System.out.print("A");
//
//		else if (a >= 80)
//			System.out.print("B");
//
//		else if (a >= 70)
//			System.out.print("C");
//
//		else if (a >= 60)
//			System.out.print("D");
//
//		else
//			System.out.print("F");
//
//		System.out.println("학점 입니다");
//
//		s.close();
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		int sco = s.nextInt();
		
		
	    if(sco>=90) {
	    	System.out.print("A\t");
	    }else if(sco>=80){
	    	System.out.print("B\t");
	    }else if(sco>=70) {
	    	System.out.print("C\t");
	    }else if(sco>=60) {
	    	System.out.print("D\t");
	    }else {
	    	System.out.print("F\t");
	    }
	    System.out.println("학점입니다.");
	    s.close();
	}

}
