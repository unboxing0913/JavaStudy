package part01.sec10.exam01;

import java.util.Scanner;

public class problem06_04 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
//		 System.out.print("임의의 정수를 입력하시오>>");
//		 int su=s.nextInt(); //5
//		 int i,k;
//		 if(su==0) {
//       System.out.println("0보다 커야합니다.");
//		 for(i=su;i>0;i--) { // 543210 밑
//			 
//			 }
//			     System.out.print(i); 		 
//		 }
//			for(k=su;k>0;k--) { //옆
//				System.out.println(i); 
		 
		 System.out.print("임의의 정수를 입력하세요>>");
		 int a = s.nextInt();
		 if (a <= 0) {
			 System.out.println("0보다 커야합니다.");
		 }                     //ex)입력값5 i값 ==>5 
		 for (int i = a; i>0; i--) { //54321
			 for(int j=0; j<i; j++) {    //12345
				System.out.print('*');}
				System.out.println();
		 
              s.close();
	           }
		 
}
}

//반복문 중첩for 사용, if문사용
// *출력
// 입력된 임의의 숫자에 맞추어 별포를 출력하여보자
// 단, 0이 입력되면 '0보다 커야합니다.'라는 메시지가 출력되게한다.