package part01.sec01.exam02;

import java.util.Scanner; // 100보다 큰경우 100보다 작은경우 100인경우

public class Exam_07 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("입력할 수 : ");
		int a = s.nextInt();

		if (a == 100)
			System.out.print("입력하신 수는 100입니다.");
		else if (a > 100)
			System.out.print("입력하신 수는 100보다 큽니다.");
		else 
			System.out.print("입력하신수는 100보다 작습니다.");

		s.close();
		
//		 Scanner s=new Scanner(System.in);
//		 
//		 System.out.print("입력할 수:");
//		 int a =s.nextInt();
//		 
//		 if(a>100) {
//		 System.out.println("입력하신수는 100보다큽니다.");
//		 }else if(a<100) {
//		 System.out.println("입력하신수는 100보다작습니다.");
//		 }else {
//		 System.out.println("입력하신수는 100입니다.");
//		 }
//		 s.close();
	}

}
