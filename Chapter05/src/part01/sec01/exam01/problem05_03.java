package part01.sec01.exam01;

import java.util.Scanner;

public class problem05_03 {
//배열
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//메모리상의 번지 시작번지 4byte ***a,***b
		//배열은 첫번째위치가  0번이다 이건 시스템의약속
		int a,b;
		char ch;    // 
		String[] str; // 배열을 나타내는것은 [] 사용하게되있음.
		// .<== 앞대상으로 ~뒤를한다 라는느낌         //ex)==>str[0](20)" "str[1](-)" "str[2](1)
		                                              //ex)  ===> String[] Str
		
		System.out.printf("수식을 한 줄로 띄어쓰기로 입력");///ex)==> a * b enter
		str=s.nextLine().split(" ");      //nextLine(); <== 문자열을 입력받을때 씀
		//str=s.nextLine().split("#");    //split(" "); <== (" ")으로 분류해라 /(" ")<-공백 ""안에 공백있음
        
		a=Integer.parseInt(str[0]);/// ex)str에 1번째있는 값을(a) 숫자로바꿔서 a에저장해라
       
		ch=str[1].charAt(0); ///ex)str에 2번째있는 값중에 첫번째 문자를(*)
       
		b=Integer.parseInt(str[2]); ///ex)str에 3번째있는값
	    
        switch(ch) {
        case '+':
        	System.out.printf("%d+%d=%d입니다.\n",a,b,a+b);
        	break;
        case '-':
        	System.out.printf("%d-%d=%d입니다.\n",a,b,a-b);
        	break;
        case '*':
        	System.out.printf("%d*%d=%d입니다.\n",a,b,a*b);
        	break;
        case '/':
        	System.out.printf("%d/%d=%f입니다.\n",a,b,(float)a/b);
        	break;
        case '%':
        	System.out.printf("%d%%%d=%d입니다.\n",a,b,a%b);
        	break;
        default:
        	System.out.printf("연산자를 잘 못 입력하였습니다.");
        	}
         s.close();
	}
}
	
	
