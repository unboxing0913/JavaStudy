package part01.sec01.exam01;

import java.util.Scanner;

public class ms_02 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 String str;		 
		 char chr;
		 int lm=0,sm=0,su=0;
		 int i=0;
		 
		 
		 
		     System.out.print("���ڿ��� �Է�: ");
		     str=s.nextLine();
		  		 		 		     
		     do {
		     chr=(char)str.charAt(i);
			 
			 if(chr>='A'&&chr<='Z') {
				 lm++;
			 }
			 if(chr>='a'&&chr<='z') {
				 sm++;
			 }
			 if(chr>='0'&&chr<='9') {
				 su++;
			 }
			 
			 i++; //do���� ������ i �����������Ѽ� �ݺ�
			 
			 
		 }while(i<str.length());
		       //0< �Է��ѹ��ڿ��ǰ������� �����������ݺ�
		
		     System.out.printf("�빮��%d��, �ҹ���%d��, ����%d��",lm,sm,su);
	         s.close();

	}
}
