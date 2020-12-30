package part01.sec01.exam01;

public class Ex03_09 {

	public static void main(String[] args) {
		int a,b,c,d; 
		
		a=100+100; //최종적 200이라는값 적용가능 : 현재값200
		b=a+100; // b값은 300
		//c=a+b+c; : c값을안줬기때문에 오류+c가문제
        c=a+b+100; // 현재값600 c값은600
        d=a+b+c; // d값은 1100
        
        System.out.printf("a,b,c,d 의 값 ==>%d, %d, %d, %d\n",a,b,c,d);
                                           //d에대입 abcd
        a=b=c=d=100;//대입연산자 100으로 변수초기화 (이부분초기화)      
        System.out.printf("a,b,c,d 의 값 ==>%d, %d, %d, %d\n",a,b,c,d);
        
        a=200;//초기화
        a=a+200;//초기화 200인 a가 들어간것
        a=a+200;//초기화 400인 a가 들어간것
                // a=200; //200으로 초기화 (마지막값으로초기화 대입이 이미 되었기때문에 600)
        
        System.out.printf("a의 값 ==>%d\n",a);
	}

}
