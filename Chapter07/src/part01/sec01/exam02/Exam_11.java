package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         
         while(true) {
        	 
        	    System.out.print("���� �Է� : ");
        	    int min=s.nextInt();
        	    
        	    int time=0; 
        	    
        	    if(min==0) { // min �ǰ��� ���ϱ⶧���� ���� ���
        	    	break;
        	    }
        	    
        	    if(min<0) {
        	    System.out.println("������ ���� �� �����ϴ�.");
        	    
        	    
        	    
        	    }else{//(min>0) 
        	    	time = min/60;
        	    	min = min%60;       	    
        	    System.out.printf("%d�ð� %d�� �Դϴ�.\n",time,min); //min/60,min%60�ص��� (time �������ְ�)
        	    }
        	    
         
         }
                 System.out.println("���α׷��� �����մϴ�.");     
		         s.close();
         

	}

}
