package part01.sec01.exam01;

import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int menu;
		
		do { //먼저실행
			System.out.printf("\n손님 주문하시겠습니까?\n");
			System.out.printf("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만 시킬래요==>");
			
			menu=s.nextInt();
			switch(menu) {
			case 1:
				System.out.printf("#카페라떼 주문하셨습니다.\n");
				break;
			case 2:
				System.out.printf("#카푸치노 주문하셨습니다.\n");
				break;
			case 3:
				System.out.printf("#아메리카노 주문하셨습니다.\n");
				break;
			case 4:
				System.out.printf("#주문하신 커피 준비하겠습니다.\n");
				break;
			default:
				System.out.printf("잘 못 주문하셨습니다.\n");
			}
		}while(menu != 4); //4와같지않다
			
			s.close();

	}

}
