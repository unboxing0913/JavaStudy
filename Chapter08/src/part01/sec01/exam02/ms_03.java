package part01.sec01.exam02;

import java.util.Scanner;

public class ms_03 {

	public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
    	    
		    System.out.print("�л����� �Է�: ");
		    int inwon=s.nextInt();
		    
		    String name[]=new String[inwon];
		    int kor[] = new int[inwon];
		    int eng[] = new int[inwon];
		    int sum[] = new int[inwon];
		    int rank[] = new int[inwon];
		    
		    for(int i=0;i<name.length;i++) {
		    	
		    	System.out.printf("%d��° �л��� �̸� : ",i+1);
		    	name[i] = s.next();		    	
		    	System.out.printf("%d�� ° �л��� �������� : ",i+1);
		    	kor[i] = s.nextInt();
		    	System.out.printf("%d�� ° �л��� �������� : ",i+1);
		    	eng[i] = s.nextInt();
		    	
		    	sum[i]=kor[i]+eng[i]; //�հ������ ����
		    }
	         // �������� ����
		    
		    for(int i=0;i<name.length;i++ ) {
		    	rank[i]=1;
		    	for(int j=0;j<name.length;j++) {
		    		if(sum[i]<sum[j]) {
		    			rank[i]++;
		    		}
		    	}System.out.printf("%s���� ������ %d�̰�, ������ %d���Դϴ�.\n",name[i],sum[i],rank[i]);
		    }s.close();
		    

	}

}


