package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("입력진수 결정<1>10 <2>16 <3>8 :");
		int a=s.nextInt();
		int data = 0 ;
		System.out.print("값 입력:");						
		
		if(a==1){
			String str = s.next();//문자열을 받아와서
			data = Integer.parseInt(str,10);//데이터에 문자열을 10진수저장
		}else if(a==2) {
			String str = s.next();		
		    data = Integer.parseInt(str,16);//데이터에 문자열을16진수저장
		}else if(a==3) {
			String str = s.next();		
			data = Integer.parseInt(str,8);//데이터에 문자열을 8진수저장
		} 

		s.close();			
		System.out.printf("10진수==>%d\n",data);
		System.out.printf("16진수==>%x\n",data);
		System.out.printf("8진수==>%o\n",data);

}
}