package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
            int kor=0;
            
            do {
            	System.out.print("���� ������ �Է� : ");
            	kor = s.nextInt();//0~100
            	
            }while(!(kor>=0&&kor<=100)); // !<=�ָ� &&�� || �ιٲ�
                    //(kor>100||kor<0)
            
            System.out.println("�Է��Ͻ� ����������"+kor+"�� �Դϴ�.");
            s.close();
	}

}
