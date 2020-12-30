package part01.sec01.exam01;

import java.util.Scanner;

public class Problem02_03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("이름을 입력:");//이름은 문자열
		String name=in.next(); //next()string-scanner클릭 문자열(위에서이름)을 입력받을때
	    System.out.print("국어점수를 입력:");
	    int kor=in.nextInt();// 정수입력받을때 nextInt() //nextFloat(),nextDouble() : 실수
	    System.out.println(name+"님의 국어점수는"+kor+"점 입니다.");	   
	    
	    in.close();
	    
//		Scanner s=new Scanner(System.in);
//		
//		System.out.print("이름을 입력: ");
//		String str=s.next();
//		System.out.print("국어점수를 입력: ");
//		int su=s.nextInt();
//		
//		System.out.print(str+"님의 국어점수는"+su+"점 입니다.");
//		
//        s.close();		

	}

}
