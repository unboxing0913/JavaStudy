package part01.sec01.exam01;

import java.util.Scanner;

//Ű���忡�� �Է¹��� ���5���� �迭�� �����ϰ� ���� ū���� ȭ�鿡 ����ϴ� ���α׷������
public class Ex08_05_01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int su[]=new int[5];
		int big=0;
		
		for(int i=0;i<5;i++) {		
	     su[i]=s.nextInt();
	     
		if(su[i]>big) {
		     big=su[i];			
		
		   }
		}
		System.out.printf("�Էµ� ������ ���� ū���� %d �Դϴ�",big);
		

		
	} 

}

