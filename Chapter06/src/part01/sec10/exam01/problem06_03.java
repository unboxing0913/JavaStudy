package part01.sec10.exam01;

import java.util.Scanner;

public class problem06_03 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str;
		int str_cnt;//���ڿ��� ������ üũ�ϴ� ����
		int i;
		
		System.out.printf("���ڸ� �Է�:");
        str=s.nextLine(); // ���ڿ� ������
        
        System.out.printf("\n");
        
        System.out.printf("�Է��� ���ڿ� ==>%s\n",str); 
        
        
        
        
        
        System.out.printf("��ȯ�� ���ڿ�====>");
        
        str_cnt = str.length(); // string Ŭ������ �������ִ� ������ ���̸� �������� ��ɾ�
        
        for(i=str_cnt-1;i>=0;i--) {//-1���ִ����� : 012345 ��6���ڴϱ� -1���ڻ���. 
 
        	 System.out.printf("%c",str.charAt(i)); // abcde�� -- ���Ѽ� => edcba 
             	       s.close();   		
        	}
    
        
         
}
}

//�ݺ��� for ���
// �Է��� ���ڿ��� �ݴ�� ���