package part01.sec01.exam01;
//연산자 수업
public class Ex04_02 {

	public static void main(String[] args) {
		int a=2,b=3,c=4;
		int result1,mok,namugi;
		double result2;
		
		result1=a+b-c;
		System.out.printf("%d+%d-%d=%d\n",a,b,c,result1);
		
		
		result1=a+b*c;
		System.out.printf("%d+%d*%d=%d\n",a,b,c,result1);
		
		
		result2=(float)a*b/c; // 6/4 ->  6.0/4.0 float 둘중하나만 넣으면됨
	    System.out.printf("%d*%d/%d=%f\n",a,b,c,result2);
	    // 실수result2 형식을맞게 %d가아닌 %f 
	    //정수나누기 정수는 정수 (정수쪽만계산해서 1.00000~)->float연산에서 캐스팅해줌
	    
	    mok=c/b;
		System.out.printf("%d/%d의 몫은%d\n",c,b,mok);
		
		
		namugi=c%b;
		System.out.printf("%d%%%d 의 나머지는 %d\n ",c,b,namugi);
		

		

		
	}

}
