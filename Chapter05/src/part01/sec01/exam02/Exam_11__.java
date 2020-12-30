package part01.sec01.exam02;

import java.util.Scanner;
//내가한거 20 10 30 안됨
public class Exam_11__ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("첫번째 수를 입력:");
		int su1 = in.nextInt();
		System.out.print("두번째 수를 입력:");
		int su2 = in.nextInt();
		System.out.print("세번째 수를 입력:");
		int su3 = in.nextInt();

		int imsi = 0;
		// 2는 1보다크다 2는 3보다크다 참일경우 213 을출력인데 3이 1보다 클경우어떻게해
		
				//su1(30),su2(20),su3(10)
		
		if(su1>=su2 && su1>=su3) { 	//su1이 가장 클때 //123,132 /su1(30),su2(20),su3(10)
			if(su2<=su3) { //132       ==>su1(30),su2(10),su3(20)
				imsi = su2; 
				su2 = su3;
				su3 = imsi;						//아닐때 123을출력하는게맞나?		
		      	}
		
		else if(su2>=su1 && su2>=su3) {	//2가 가장클때 su1(20),su2(10),su3(30)
			imsi = su1;
			su1 = su2;  //213
			su2 = imsi;	
			
			if(su2<=su3) {// su1(20),su2(30),su1(10)
				imsi=su2;//여기su1은 =su2
				su2=su3;
				su3=imsi;			 			
		      }
		else if(su3>=su1 && su3>=su2) {		//3이 가장클떄
			imsi = su1;     //su1(30),su2(20),su3(10)
			su1 = su3;  //321
			su3 = imsi;
			 
			 if(su3>su2) //312     
				imsi=su3; //su1(30),su2(10),su3(20)
				su3=su2;
				su2=imsi;             //// if(su1>su2) X 왜냐면 위에서 su1=su3으로 바꿧기때문에 Su3=su1이다.
				                             // 이따 물어보기 : su1=>이미 su3을줘서 su3값을가지고있는데 이게문제
				                        
		}
						
		      
		
		}
	}
		System.out.printf("%d >= %d >=%d", su1, su2, su3);// 내림차순출력알아보기
		in.close();
		
}
}