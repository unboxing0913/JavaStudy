package part01.sec01.exam01;

public class Ex03_10 {

	public static void main(String[] args) {
		 int a=100,b=200; // 정수
		 double result;
	     
		 result=a/b; //   정수/정수 ==> 정수
		 
		 System.out.printf("%f\n",result); //그래서 0.000000000으로표기
		 
		 a=170;
		 b=30;		 
		 
		 result=a/b; 
		 // 5.666666666666667 -> 정수쪽만계산 결과값 5.000000 (실수와구조자체가 다름)
		 
		 System.out.printf("%f\n",result); // %f 때문에 실수계산이지만 정수쪽만계산
		 		
		 //float w=0.1234;
		 float w=0.1234f; //기본적으로 자바에서 실수는 double로 인식되기때문에 f로 float 바꿔주기
		 System.out.printf("%f\n",w);
		 
		 double y=0.1234;
		 System.out.printf("%f\n",y);
		 
		 

	}

}
