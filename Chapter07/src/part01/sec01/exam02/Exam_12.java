package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
            int kor=0;
            
            do {
            	System.out.print("국어 점수를 입력 : ");
            	kor = s.nextInt();//0~100
            	
            }while(!(kor>=0&&kor<=100)); // !<=주면 &&도 || 로바뀜
                    //(kor>100||kor<0)
            
            System.out.println("입력하신 국어점수는"+kor+"점 입니다.");
            s.close();
	}

}
