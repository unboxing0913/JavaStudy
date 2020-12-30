package part01.sec10.exam01;

import java.util.Scanner;

public class ms_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요>>");
        int a = s.nextInt();
        int i,j; 
        if (a==0) {
        	System.out.print("0보다 커야합니다");       
        }
        for (i=1;i<=a;i++) { //a번실행 ex)5번실행 //i => 012345
           for(j=1;j<=i;j++) { //이거전체를 다섯번실행 //012345
        	   
        	   System.out.print('*');
             	   
          }
               System.out.println();
           
           }
        
        
        }
	}


//반복문 중첩for 사용, if문사용
//*출력
//입력된 임의의 숫자에 맞추어 별포를 출력하여보자
//단, 0이 입력되면 '0보다 커야합니다.'라는 메시지가 출력되게한다.