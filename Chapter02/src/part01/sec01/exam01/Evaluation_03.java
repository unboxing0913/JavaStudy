package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_03 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.print("�̸��� �Է�:");
		String name = s.next();
		
		System.out.print("���������� �Է�:");
		int sco = s.nextInt();
		
		System.out.print("���������� �Է�:");
        int	sco2 = s.nextInt();	
		
        int result = sco+sco2;
		System.out.printf("%s���� �������� %d�� �Դϴ�.",name,result);

        s.close();		
	}

}
