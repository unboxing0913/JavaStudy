package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���==>");
		int a = s.nextInt();
		
		System.out.printf("10����==>%d\n",a);
		System.out.printf("16����==>%X\n",a);
		System.out.printf("8����==>%o\n",a);
        
		s.close();
	}

}
