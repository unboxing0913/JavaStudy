package part01.sec01.exam01;

public class Ex03_11 {

	public static void main(String[] args) {
		
		//int a,b,c,d,e;
		
		//a='A'; // 65
		//System.out.printf("%c \t",a);
		//System.out.printf("%d \n",a);
		
		char a,b,c,d,e; //���ڸ������ϴ� 2byte Ÿ�� (0~65535) �����ڵ�
		
		a='A'; // 65(A)
		System.out.printf("%c \t",a);
		//System.out.printf("%d \n",a); //�������������� ����ִ°����� Ÿ�Ը���üũ�ϱ⶧��
		System.out.printf("%d \n",(int)a); // Ÿ�Ժ�ȯ�� int�� ĳ�����ϰ� ����ϸ� �ƽ�Ű�ڵ�� ��ȯ�Ǵ°ɺ�
		
		b='a'; // 97(a)
		//c=b+1; Ÿ���̾ȸ��� char Ÿ������ �ٲ������ ���������� 1������ ���ڷιٲ۴��� a������b abcd���ĺ���
		c=(char) (b+1);
		System.out.printf("%c \t",b);
		System.out.printf("%c \t\n",c);
		
		d=90; // Z(90) ���ڸ� �־ ���ڷ� ��� char
		System.out.printf("%c \t\n",d);//%c���ڷ� ���  �ƽ�Ű�ڵ� 90�� Z
		
		d='��';
		System.out.printf("%c \t",d);
	    e=(char) (d+1); // ��+1 ��?
		System.out.printf("%c \t\n",e);
		
		
		System.out.printf("%d \t\n",(int)d); //�����ڵ� �ѱ� �������� ��=44032 ��44033
		System.out.printf("%d \t\n",(int)e); //����Ÿ�� �����ֱ� 
	}

}
