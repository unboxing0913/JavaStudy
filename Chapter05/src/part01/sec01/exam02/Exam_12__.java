package part01.sec01.exam02;

import java.io.IOException;

public class Exam_12__ {

	public static void main(String[] args) throws IOException {//read �����ʿ�
		                                   //�� ������ ���߿����ι���(add throws ~~~) 
		                                          
		System.out.print("������ �����Ѱ��� �Է��ϼ��� : ");
		char ch=(char)System.in.read();//read�� �����ϳ��� ��ƮŸ������ �д°� ( a -> 97�� )
		         // ĳ�����ϴ������� ���� ��ƮŸ�Ը��� ����Ÿ���� �ʿ��ϱ⶧��	
		System.in.skip(2);//(2)<-2������ŵ LF , CR
		//���� //�ƽ�Ű�ڵ� (LF+CR) Enter��Ȱ  read ���� ����Ű ��ü�� �ν��� 	
		System.out.print("������ �����Ѱ��� �Է��ϼ��� : ");
		char ch2=(char)System.in.read();
			
		
		if (ch>ch2) {
			System.out.println("ù��° �Է��Ͻ� ������ �ƽ�Ű�ڵ尪�� �� Ů�ϴ�.");
		}if(ch<ch2) {
			System.out.println("�ι�° �Է��Ͻ� ������ �ƽ�Ű�ڵ尪�� �� Ů�ϴ�.");
		}else {
			System.out.println("�Է��Ͻ� �� ���ڴ� ���� ���� �Դϴ�.");
		}
		
	
		
	}

}
