package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_12 {
	            //반환타입      //메소드         (/매개변수)
	public static int coffee_machine(int button) {
		System.out.println("\n#1.(자동으로 )뜨거운 물을 준비한다");
		System.out.println("\n#2.(자동으로 )종이컵을 준비한다");
		
		
		switch(button) {
		case 1:
			System.out.println("#3.(자동으로) 보통커피를 탄다.");
			break;
		case 2:
			System.out.println("#3.(자동으로)설탕커피를 탄다.");
			break;
		case 3:
			System.out.println("#3.(자동으로)블랙커피를 탄다.");
			break;
		default:
			System.out.println("#3.(자동으로)아무거나 탄다");
			break;
		}
		
		System.out.println("#4.(자동으로)물을 붓는다.");
		System.out.println("#4.(자동으로)스푼으로 저어서 녹인다.");
		
		return 0; // 반환타입 맞춰서 리턴에 주기위해 아무정수나 입력
	}
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int coffee;
		int ret;
		
		System.out.print("A고객님,어떤 커피를 드릴까요?(1.보통|2.설탕|3.블랙)");
		coffee=s.nextInt();
		ret=coffee_machine(coffee); // return된 0의값 여기있음
		System.out.println("A고객님 커피 여기있습니다.");
		
		System.out.print("B고객님,어떤 커피를 드릴까요?(1.보통|2.설탕|3.블랙)");
		coffee=s.nextInt();
		coffee_machine(coffee);
		System.out.print("B고객님 커피 여기있습니다.");
		
		System.out.print("C고객님,어떤 커피를 드릴까요?(1.보통|2.설탕|3.블랙)");
		coffee=s.nextInt();
		coffee_machine(coffee);
		System.out.print("C고객님 커피 여기있습니다.");
		
		s.close();
	
	}

}
