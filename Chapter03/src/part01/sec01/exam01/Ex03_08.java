package part01.sec01.exam01;

public class Ex03_08 {

	public static void main(String[] args) {
	   int a,b;
	   double c,d;
	   
	   a=100;// 메모리 공간(변수) = 값
	   b=a; //a변수에있는값을 b에 준다 a=b
	    
	   System.out.printf("a,b의 값 ==> %d, %d\n",a,b); //%d 정수
	   
	   c=111.1;
	   d=c;
	   
	   System.out.printf("a,b의 값 ==> %5.1f, %5.1f\n",c,d); 
	                                 //%f 실수(전체자릿수5자리중에 소수점1자리 5.1)
	   

	}

}
