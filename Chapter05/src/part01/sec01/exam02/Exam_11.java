package part01.sec01.exam02;
//선생님이 하신거 내림차순 출력알아보기
import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("첫번째 수를 입력:");
		int su1 = in.nextInt();
		System.out.print("두번째 수를 입력:");
		int su2 = in.nextInt();
		System.out.print("세번째 수를 입력:");
		int su3 = in.nextInt();

		if(su2>=su1 && su2>=su3) { // 2가 1,3보다클때//213,231
			int imsi=su1; // 임시=1
			su1=su2; // 1=>2 
		    su2=imsi;// 2=>1     //213
		}else if(su3>=su1 && su3>=su2) { // 
			int imsi=su1;//임시=1
			su1=su3;//1=>3
			su3=imsi;//3=>1 // 321
		}
		
		if (su3>=su2) { //
			int imsi=su2; //
			su2=su3; //
			su3=imsi; 
		}
			/*213 321
			  123 ->x ->132 /123은 그냥출력되는데로나오면된다고 치자.//
			  231 ->x ->321 /231은? 왜출력이되는가.....
			  321 ->o
			  132 ->o	*/			
		 
		
						
		
		     // 213 321 
			//123 231
	System.out.printf("%d >= %d >=%d", su1, su2, su3);// 내림차순출력알아보기
	in.close();
}
}