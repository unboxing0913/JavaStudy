package part01.sec01.exam02;

import java.io.IOException;

public class ms_02 {

	public static void main(String[] args)throws IOException {
	
		 
		 
		 System.out.print("������ ���� �Ѱ��� �Է��ϼ��� : ");
		 char a = (char) System.in.read();
		 
		 System.in.skip(2);
		 
		 System.out.print("������ ���� �Ѱ��� �Է��ϼ��� : ");
		 char b = (char) System.in.read();
		 
		
		 
		 if(a>b) {
			 System.out.println("ù��° �Է��Ͻ� ������ �ƽ�Ű�ڵ尪�� �� Ů�ϴ�.");
		 }else if(a<b) {				 			 
				 System.out.println("�ι�° �Է��Ͻ� ������ �ƽ�Ű�ڵ尪�� �� Ů�ϴ�.");
			 }else {
				 System.out.println("�Է��Ͻ� ������ �ƽ�Ű�ڵ尪�� �����ϴ�.");
			 }
		 
	}

}
