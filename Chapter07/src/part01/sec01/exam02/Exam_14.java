package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		//1부터 100사이의 수를 하나 선택한다
		// 컴퓨터가 만들어낸 랜덤 숫자를 맞추면 ?번만에 맞추셨습니다. 출력
        Scanner s=new Scanner(System.in);
        int comsu=(int)(Math.random()*100)+1; //1~100
        int i=0;//0주고 앞에다가 i++미리증가시켜주면
        while(true) {
        	System.out.print("컴퓨터 수: ");
        	int su=s.nextInt();
        	i++;//i가없어도 그다음명령문이 실행될때 i는증가해서 앞쪽에 써주기
        	if(su==comsu) {
        		break;
        	}else if(su < comsu) {
        			System.out.println("up입니다.");
        	}else {
        		System.out.println("down입니다.");
        		}
        	
        	//i++;
        	
        	}
        
              System.out.println(i+"번만에 맞추셨습니다.");
              s.close();
        }
	}


