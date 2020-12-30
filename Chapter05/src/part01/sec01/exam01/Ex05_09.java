package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_09 {
       //Switch(정수,String)==>switch문으로 비교할수있는대상
	      //실수값은 Switch문을 사용할수없음.
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		int a;
//		
//		System.out.print("1~4중에 선택하세요:");
//		a=s.nextInt(); //1~4
//		//집중
//		switch(a) { // 키보드로 부터 입력받을값 ()
//		case 1: //case(띄우고)값:
//			System.out.println("1을 선택했다.");
//			break;//스위치문 종료 각각해줘야함. 안하면 밑에 쭉~나옴 
//		case 2:
//			System.out.println("2을 선택했다.");
//			break;
//		case 3:
//			System.out.println("3을 선택했다.");
//			break;
//		case 4:
//			System.out.println("4을 선택했다.");
//		    break; 
//		default://해당번호가없을때 내가 ~~메세지 ~~처리를하고싶다 할때 씀
//			System.out.println("해당번호 없습니다.");
//		    }
//		
//		s.close();
		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.print("1~4중에 선택하세요:");
//		int a = s.nextInt();
//		
//		switch(a){//괄호쳐
//		
//		case 1:		
//		System.out.print("1을 선택했습니다.");
//		        break;//
//		case 2:
//		System.out.print("2를 선택했습니다.");
//                break;
//		case 3:
//	    System.out.print("3을 선택했습니다.");
//                break;
//		case 4:
//		System.out.print("4를 선택했습니다.");
//                break;
//		default:    //외우자
//		System.out.print("해당번호 없습니다.");
//		}
//		s.close();
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("1~4중에 선택하세요:");
		int type =s.nextInt();
		
		switch(type) {
		case 1:
			System.out.println("1을 선택했다.");
			break;
		case 2:
			System.out.println("2를 선택했다.");
			break;
		case 3:
			System.out.println("3을 선택했다.");
			break;
		case 4:
			System.out.println("4를 선택했다.");
			break;
		default:
			System.out.println("잘못된 숫자를 선택했습니다.");
		}
		
			s.close();
			
		
	}

}
