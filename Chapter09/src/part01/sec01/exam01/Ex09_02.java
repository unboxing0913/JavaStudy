package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.printf("���ڿ� �Է� ==> ");
		str = s.nextLine();
		System.out.printf("��� ���ڿ�==> ");
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='o') { // o�� ���� ���������� �ƽ�Ű�ڵ� �����̱⶧���� ==�� ��
				System.out.printf("%c",'$');
			}else {
				System.out.printf("%c",str.charAt(i));
			}
				
		}
		        System.out.println("\n�Էµ� ���ڿ� :"+str);

		        s.close();
		        
	}

}

//���ڿ� �Է� ==> Programming Java OK!!
//��� ���ڿ�==> Pr$gramming Java OK!!          ==> o�� $�� �ٲ�����ƴ� ��¸� �Ѱ�
//�Էµ� ���ڿ� :Programming Java OK!!
