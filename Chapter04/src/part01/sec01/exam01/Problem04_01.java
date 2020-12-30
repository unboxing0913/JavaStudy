package part01.sec01.exam01;

import java.util.Scanner;

public class Problem04_01 {

	public static void main(String[] args) {
		float a,b,c;
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.printf("첫번째 계산할 값을 입력하세요 ==>");//스캐너쓸땐 형식적용x 무슨형식인지모름
		b=s.nextFloat();// 변수가float때문에 nextFloat사용
		
		System.out.printf("두번째 계산할 값을 입력하세요 ==>");
		c=s.nextFloat();
		
		a=b+c;		
		System.out.printf("%5.2f + %5.2f=%5.2f \n",b,c,a);
		
		a=b-c;
		System.out.printf("%5.2f - %5.2f=%5.2f \n",b,c,a);
		
		a=b*c;
		System.out.printf("%5.2f * %5.2f=%5.2f \n",b,c,a);
		
		a=b/c;
		System.out.printf("%5.2f / %5.2f=%5.2f \n",b,c,a);
		
		//a=(int)b%c 연산식에서 타입바꾸지말고 출력에서바꿈 /못해결함                      (문제) 10 + 2 = 0
		//System.out.printf("%2.0f %% %1.0f=%f \n",b,c,a); //a,b,c float타입 변하지않음
		
		a=(int)b%(int)c; 
		//a=b%c; 변수로하면 계산가능
		System.out.printf("%d %% %d=%d \n",(int)b,(int)c,(int)a);
        
		System.out.println("a="+a); 
		
        //a=3.5%2.5; //원래 실수타입은 float로 나머지연산 못함 double가능 (정수와 정수가 정석)
        //보통 나머지연산자를 실수로안씀(정석)
		//System.out.println(a);
        s.close();
        
//		Scanner s=new Scanner(System.in);
//		float reslut;
//		
//		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
//		float a = s.nextFloat();
//		System.out.print("두번째 계산할 값을 입력하세요 ==>");
//		float b = s.nextFloat();
//		
//		reslut = a+b;
//		System.out.printf("%5.2f+%5.2f = %5.2f\n",a,b,reslut);
//		reslut = a-b;
//		System.out.printf("%5.2f-%5.2f = %5.2f\n",a,b,reslut);
//		reslut = a*b;
//		System.out.printf("%5.2f*%5.2f = %5.2f\n",a,b,reslut);
//		reslut = a/b;
//		System.out.printf("%5.2f/%5.2f = %5.2f\n",a,b,reslut);
//		
//		reslut = (int)a%(int)b; //
//		System.out.printf("%d%%%d = %d\n",(int)a,(int)b,(int)reslut); //
//		
//		System.out.print("reslut="+reslut); //
//		 s.close();
		
		

	
	
	
	
	
	
	}

}
