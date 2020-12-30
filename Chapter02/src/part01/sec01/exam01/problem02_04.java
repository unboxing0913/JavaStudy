package part01.sec01.exam01;

import java.util.Scanner;

public class problem02_04 {

	public static void main(String[] args) {
		
//		Scanner in=new Scanner(System.in);
//				\	
//		System.out.print("이름을 입력:");
//		String name=in.next(); 
//	    
//		System.out.print("국어점수를 입력:");	    
//	    int kor=in.nextInt();
//	    
//	    System.out.print("영어점수를 입력:");
//	    int eng=in.nextInt();
//	    
//	    
//	    System.out.println(name+"님의 총점은"+(kor+eng)+"점 입니다.");
//	                    //변수=kor+eng이런식의 변수 선언하고 사용해도됨 (나중에 평균까지 계산할때 용이)
//	                                             
//         in.close();
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("이름을 입력 : ");
		String name =s.next();
		System.out.print("국어점수를 입력 : ");
		int kor=s.nextInt();
		System.out.print("영어점수를 입력 : ");
		int elg=s.nextInt();
		
		int result=kor+elg;
		System.out.print(name+"님의 총점은"+result+"점 입니다.");
		
		s.close();
	}

}
