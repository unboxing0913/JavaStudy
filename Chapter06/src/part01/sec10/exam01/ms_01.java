package part01.sec10.exam01;

import java.util.Scanner;

public class ms_01 {

	public static void main(String[] args) {
		//�ݺ��� for ���
		// �Է��� ���ڿ��� �ݴ�� ���
		Scanner s=new Scanner(System.in);	                  
        String str;
        int str_cnt;
        int i;
		
		System.out.print("���ڸ� �Է�:");      
        str=s.nextLine();
        
        System.out.printf("�Է��� ���ڿ�==>%s\n",str);
        
        System.out.print("��ȯ�� ���ڿ�==>");
        str_cnt = str.length();
        
        for(i=str_cnt-1;i>=0;i--) {//  01234
        	//������ ���ڷ� ��ȯ���ɽ�Ű��
        	System.out.printf("%c",str.charAt(i));//0�޾ƿ���1�޾ƿ���2�޾ƿ��� ����
        	s.close();
        }
        
        
	}

}
