package part01.sec01.exam02;

import java.util.Scanner;

public class ms_03 {

	public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
    	    
		    System.out.print("학생수를 입력: ");
		    int inwon=s.nextInt();
		    
		    String name[]=new String[inwon];
		    int kor[] = new int[inwon];
		    int eng[] = new int[inwon];
		    int sum[] = new int[inwon];
		    int rank[] = new int[inwon];
		    
		    for(int i=0;i<name.length;i++) {
		    	
		    	System.out.printf("%d번째 학생의 이름 : ",i+1);
		    	name[i] = s.next();		    	
		    	System.out.printf("%d번 째 학생의 국어점수 : ",i+1);
		    	kor[i] = s.nextInt();
		    	System.out.printf("%d번 째 학생의 영어점수 : ",i+1);
		    	eng[i] = s.nextInt();
		    	
		    	sum[i]=kor[i]+eng[i]; //합계까지의 명렁문
		    }
	         // 순위구할 차례
		    
		    for(int i=0;i<name.length;i++ ) {
		    	rank[i]=1;
		    	for(int j=0;j<name.length;j++) {
		    		if(sum[i]<sum[j]) {
		    			rank[i]++;
		    		}
		    	}System.out.printf("%s님의 총점은 %d이고, 순위는 %d등입니다.\n",name[i],sum[i],rank[i]);
		    }s.close();
		    

	}

}


