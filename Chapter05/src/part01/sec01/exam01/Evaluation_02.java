package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("가위(1),바위(2),보(3)중 하나를 입력하세요.=>");
		
		
		int use = s.nextInt();		
		System.out.printf("당신은 %d입니다.\n",use);
		
		int com = (int)(Math.random()*3)+1;//난수발생 0~0.999999999
		System.out.printf("컴은 %d입니다.\n",com);
		
		
		
		switch(use-com) {
		
		case 2:
			System.out.print("졌습니다.");
			break;
		case 1:
			System.out.print("이겼습니다.");
			break;
		case -1:
			System.out.print("졌습니다.");
			break;
		case -2:
			System.out.print("이겼습니다.");
			break;		
		default:
			System.out.print("비겼습니다.");
		}
		 s.close();

	}

}
