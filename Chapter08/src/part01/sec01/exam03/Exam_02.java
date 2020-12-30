package part01.sec01.exam03;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		
		disp();
			
		output(10,20,30);
		
		
		int sum=hap(10,20);//30
		System.out.println("sum="+sum);
		
		
		int su1=input();
		int su2=input();
		
		
		int su3=hap(su1,su2);
		output(su1,su2,su3);
		
		
	}
	
	public static void disp() {// 반환값이 없고 매개변수도 없는 경우
		System.out.println("2020.09.10일 메소드 공부중....");
	}
	
	public static void output(int a,int b,int c) { //반환값이 없고 매개변수는 있는 경우
		System.out.printf("%d + %d = %d\n",a,b,c);
	}
	
	public static int hap(int a,int b) {//반환값이 있고 매개변수도 있는경우
		
		return a+b; // ex)10,20 줫을때 30
	}
	
	public static int input() { //반환값이 있고 매개변수는 없는경우
		Scanner in=new Scanner(System.in);
		System.out.print("수를 입력 : ");
	    int su=in.nextInt();	    
	    //in.close(); 두번연속 호출했기 때문에 여기서 터짐 : 연속호출할때 Scanner 닫지않기
	    return su;
	    
	}

}
