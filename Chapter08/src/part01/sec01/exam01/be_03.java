package part01.sec01.exam01;

import java.util.Scanner;

public class be_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		char space[]=new char[5]; // 터널공간지정
		
		int select=0; //while문안에 들어가있는 select의 값이없으면 오류남 그래서 초기화하고시작
		char carName='A';		
		int n = 0;
		
		
		while(select !=3 ) { // 반복해야하니깐 while문에 다들어가야함
			System.out.print("<1>자동차 넣기|<2>자동차 빼기|<3>끝 : ");			
			select = s.nextInt();
							
			switch(select) {
			
			
			case 1:
				
				if(n>=space.length) {
					System.out.println("터널이 꽉차서 차가 못 들어감");
				}else {		
				space[n]=carName++; //	 space[0]=A++ 뒤에 ++이기때문에 계산끝나고 증가
				System.out.printf("%c 자동차가 터널에 들어감\n",space[n]);// 문자보일려면 앞에서줘야 밑에서 출력이됨
				
				n++;//자동차 갯수세기와 동시에 space 값 늘리는 목적의 변수
				
				
				}
				break;
				
			case 2:
				if(n<=0) { //0대있을때도 적용해줘야함
					System.out.println("빠져나갈 자동차가 없음");
				}else {
				
				n--;//위에 입력해야함 빼고나서 출력해야하기때문						
				System.out.printf("%c 자동차가 터널에서 빠짐\n",space[n]);
				space[n]=carName--;
				
				
				}
				break; // 브레이크문 else 괄호 끝나고 써야함 안그러면 참이엿을때 안멈추고 출력됨
			case 3:
				System.out.printf("현재 터널에 %d대가 있음\n",n);
				System.out.println("프로그램을 종료합니다."); // 프로그램종료는 3이엿을때해야함 안그러면 반복마다출력
			    break;
			    
		    default:
		    	System.out.println("잘못 입력하셨습니다. 다시입력하세요\n");
		    	
			} 
		}	s.close();
		}
			
			
		
		}
		

	
//	 Scanner s=new Scanner(System.in);
//	 char[] stack=new char[5];
//	 int top=0;
//	 char carName='A';
//	 int select=0;
//	 
//	 while(select != 3) {  // 3이면 반복문 실행안함 거짓이기때문에 
//		 System.out.printf("<1>자동차 넣기|<2>자동차 빼기|<3>끝     :");
//		 select=s.nextInt();
//		 
//		 switch(select) {
//		 case 1:
//			 
//			 if(top>=5) {//5대까지들어감
//				 System.out.printf("터널이 꽉차서 차가 못 들어감\n");
//			 }else {
//				 stack[top]=carName++;
//				 System.out.printf("%c 자동차가 터널에 들어감\n",stack[top]);
//				 top++;
//			 }
//			 break;
//			 
//		 case 2:
//			 
//			 if(top <= 0) {
//				 System.out.printf("빠져나갈 자동차가 없음\n");
//			 }else {
//				 top--;
//				 System.out.printf("%c자동차가 터널에서 빠짐\n",stack[top]);
//				 stack[top]=' ';
//			 }
//			 break;
//			 
//		 case 3:
//			 
//			 System.out.printf("현재 터널에 %d대가 있음.\n",top);
//			 System.out.printf("프로그램을 종료합니다.\n");
//		     break;
//		 default:
//			 System.out.println("잘못 입력했습니다. 다시 입력하세요\n");
//		 }
//	 }
//               s.close();
//}
//
//}

