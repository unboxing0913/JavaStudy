package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_01 {

	public static void main(String[] args) {
               
		Scanner s=new Scanner(System.in);
               
        System.out.print("첫번째 계산할 값을 입력하세요==>"); 
        double a = s.nextDouble();
        System.out.print("두번째 계산할 값을 입력하세요==>"); 
        double b = s.nextDouble();
        
        double result;
        result = a+b;
        System.out.printf("%5.2f+%5.2f=%5.2f\n",a,b,result);
        result = a-b;
        System.out.printf("%5.2f-%5.2f=%5.2f\n",a,b,result);
        result = a*b;
        System.out.printf("%5.2f*%5.2f=%5.2f\n",a,b,result);
        result = a/b;
        System.out.printf("%5.2f/%5.2f=%5.2f\n",a,b,result);
        result = a%b;
        System.out.printf("%d%%%d=%d\n",(int)a,(int)b,(int)result);
       
        System.out.println("a="+result);
        
        s.close();
	}

}
