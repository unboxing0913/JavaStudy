package part01.sec01.exam01;

import java.util.Scanner;

public class problem05_03 {
//�迭
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//�޸𸮻��� ���� ���۹��� 4byte ***a,***b
		//�迭�� ù��°��ġ��  0���̴� �̰� �ý����Ǿ��
		int a,b;
		char ch;    // 
		String[] str; // �迭�� ��Ÿ���°��� [] ����ϰԵ�����.
		// .<== �մ������ ~�ڸ��Ѵ� ��´���         //ex)==>str[0](20)" "str[1](-)" "str[2](1)
		                                              //ex)  ===> String[] Str
		
		System.out.printf("������ �� �ٷ� ����� �Է�");///ex)==> a * b enter
		str=s.nextLine().split(" ");      //nextLine(); <== ���ڿ��� �Է¹����� ��
		//str=s.nextLine().split("#");    //split(" "); <== (" ")���� �з��ض� /(" ")<-���� ""�ȿ� ��������
        
		a=Integer.parseInt(str[0]);/// ex)str�� 1��°�ִ� ����(a) ���ڷιٲ㼭 a�������ض�
       
		ch=str[1].charAt(0); ///ex)str�� 2��°�ִ� ���߿� ù��° ���ڸ�(*)
       
		b=Integer.parseInt(str[2]); ///ex)str�� 3��°�ִ°�
	    
        switch(ch) {
        case '+':
        	System.out.printf("%d+%d=%d�Դϴ�.\n",a,b,a+b);
        	break;
        case '-':
        	System.out.printf("%d-%d=%d�Դϴ�.\n",a,b,a-b);
        	break;
        case '*':
        	System.out.printf("%d*%d=%d�Դϴ�.\n",a,b,a*b);
        	break;
        case '/':
        	System.out.printf("%d/%d=%f�Դϴ�.\n",a,b,(float)a/b);
        	break;
        case '%':
        	System.out.printf("%d%%%d=%d�Դϴ�.\n",a,b,a%b);
        	break;
        default:
        	System.out.printf("�����ڸ� �� �� �Է��Ͽ����ϴ�.");
        	}
         s.close();
	}
}
	
	
