package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         
         while(true) {
        	 
        	    System.out.print("분을 입력 : ");
        	    int min=s.nextInt();
        	    
        	    int time=0; 
        	    
        	    if(min==0) { // min 의값이 변하기때문에 먼저 명령
        	    	break;
        	    }
        	    
        	    if(min<0) {
        	    System.out.println("음수는 넣을 수 없습니다.");
        	    
        	    
        	    
        	    }else{//(min>0) 
        	    	time = min/60;
        	    	min = min%60;       	    
        	    System.out.printf("%d시간 %d분 입니다.\n",time,min); //min/60,min%60해도됨 (time 변수안주고)
        	    }
        	    
         
         }
                 System.out.println("프로그램을 종료합니다.");     
		         s.close();
         

	}

}
