package part01.sec01.exam01;

import java.util.Scanner;

public class Problem07_02 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 String str;
		 char ch;
		 int upper_cnt=0,lowe_cnt=0,digit_cnt=0;
		 int i=0;
		 
		 
		 System.out.print("���ڿ��� �Է� : ");
		 str=s.nextLine();
		 
		 i=0;
		 
		 do {
			 ch=str.charAt(i); // 0��°��
			 if(ch>='A'&&ch<='Z') //�ƽ�Ű �ڵ尪 ���� �ʿ����.
				 upper_cnt++;// //�̰�Ʋ���� ��ǰ
			 if(ch>='a'&&ch<='z') 
				 lowe_cnt++;
			 if(ch>='0'&&ch<='9')
				 digit_cnt++;
			 i++; // i���� �������Ѽ� �ݺ��ؾ��ϱ⶧��
		 }while(i<str.length()); // < ���������� ���ڿ� ������ 0���� ǥ���ϱ⶧��
		 
		 System.out.printf("�빮�� %d��, �ҹ���%d��, ����%d��",upper_cnt,lowe_cnt,digit_cnt);
		
         s.close();
	}

}

