package part01.sec01.exam01;

import java.util.Scanner;

public class Problem02_03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("�̸��� �Է�:");//�̸��� ���ڿ�
		String name=in.next(); //next()string-scannerŬ�� ���ڿ�(�������̸�)�� �Է¹�����
	    System.out.print("���������� �Է�:");
	    int kor=in.nextInt();// �����Է¹����� nextInt() //nextFloat(),nextDouble() : �Ǽ�
	    System.out.println(name+"���� ����������"+kor+"�� �Դϴ�.");	   
	    
	    in.close();
	    
//		Scanner s=new Scanner(System.in);
//		
//		System.out.print("�̸��� �Է�: ");
//		String str=s.next();
//		System.out.print("���������� �Է�: ");
//		int su=s.nextInt();
//		
//		System.out.print(str+"���� ����������"+su+"�� �Դϴ�.");
//		
//        s.close();		

	}

}
