package part01.sec01.exam01;

import java.util.Scanner;

public class Ex07_02_01 {

	public static void main(String[] args) {
	         Scanner rd=new Scanner (System.in);
		     int i=0;
	         int n=0;
	         double sum=0;
	    while((i = rd.nextInt())!=0) { // �ϳ��� ������ó��
	    	
	    	 n++; // ��������
		     sum = sum+i; 	// �����������
		}
		
	     
	System.out.println("�Էµ� ���� ������"+n+"���̸� �����"+sum/n+"�Դϴ�.");
	
	
	rd.close();	
	}

}
