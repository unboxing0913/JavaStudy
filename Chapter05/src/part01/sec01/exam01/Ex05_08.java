package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_08 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int a;
//
//		System.out.print("������ �Է��ϼ���:");
//		a = s.nextInt();
//
//		if (a >= 90) // ������ if�� �ϳ��� ���
//			System.out.print("A");
//
//		else if (a >= 80)
//			System.out.print("B");
//
//		else if (a >= 70)
//			System.out.print("C");
//
//		else if (a >= 60)
//			System.out.print("D");
//
//		else
//			System.out.print("F");
//
//		System.out.println("���� �Դϴ�");
//
//		s.close();
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		int sco = s.nextInt();
		
		
	    if(sco>=90) {
	    	System.out.print("A\t");
	    }else if(sco>=80){
	    	System.out.print("B\t");
	    }else if(sco>=70) {
	    	System.out.print("C\t");
	    }else if(sco>=60) {
	    	System.out.print("D\t");
	    }else {
	    	System.out.print("F\t");
	    }
	    System.out.println("�����Դϴ�.");
	    s.close();
	}

}
