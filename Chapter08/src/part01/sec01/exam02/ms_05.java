package part01.sec01.exam02;

import java.util.Scanner;

public class ms_05 {

	public static void main(String[] args) {
		            Scanner s=new Scanner(System.in);
		
		     int com[]=new int[6];
		     int use[]=new int[6];
		     int co = 0;
		     
		     for(int i=0;i<com.length;i++) {
		    	 com[i]=(int)(Math.random()*45)+1;
		    	for(int j=0;j<i;j++) {
		    		if(com[i]==com[j]) {
		    			i--;	
		    			break;		    		
		    		}
		    	}		    	 
		      }
		     
		     for(int i=0;i<use.length;i++) {
		    	do {
		    		System.out.printf("%d��° ���� �Է��ϼ���:",i+1);
		    		use[i]=s.nextInt();
		    	}while(use[i]<1 || use[i]>45);
		           
		    	  for(int j=0;j<i;j++) {
		    		if(use[i]==use[j]) {
		    			i--;
		    			break;
		    		}
		    	}
		     }
		     
		     for(int i=0;i<com.length;i++) {
		    	 for(int j=0;j<use.length;j++) {
		    		 if(com[i]==use[j]) {
		    			 co++;
		    			 break;
		    		 }
		    	 }
		     }
		       System.out.println(co+"���� ���߼̽��ϴ�");
		       s.close();
		    
	} 

}
            //System.out.printf("%d��° ���� �Է�: ",i+1);	 