package part01.sec01.exam01;

public class Ex03_12 {

	public static void main(String[] args) {
	  int a,b; //4byte ũ��
	 char c,d; //2byte ũ��
	 
	 a=0xF90A;                                                //������ȯ (2����) �� �Ųٷ�
	 b=0x50; //10���� 80
	 System.out.printf("%c \n", a); //16���� ������� ���� printf <-�������
	 
	 //c=b; // b�� intŸ�� c��charŸ�� ���ԺҰ�
	 
	
	 c=(char)b;  // ���������� ũ��� ���� ������ �ʴ´�.(���Ƿ� ���� ����Ѵٺ����)  
                  //2byte¥�� b ���Ѱ����ƴ� ������ 2byte�̻� b�� ũ�ٸ� ����
	 System.out.printf("%c %d\n", c,(int)c);
	              //����Ÿ��   //10����
	 
	 
	 d='#';
	 System.out.printf("%c�� ASCII���� %d�Դϴ�\n", d,(int)d); 
	                // %c(����)�� ASCII���� %d(����)�Դϴ� ������
	 
	
	 
	}

	//char a; main�ۿ��ִ°��� ��ȿó�� [�̰ɼ��������� �ؿ��͵� ����]
	//a='Ab'; error // ���ڿ�(����2���̻�)�� ū����ǥ  ��������ǥ������ ����
	//a="A"; error // �ϳ����� ���ڿ��̸����� Ÿ�Զ����� ���� ==> a="A"���ڿ�  ���ڿ��� String  
	//a="Ab"; error // ���ڿ��������� �����ϴº����� Ʋ�� ==> ���ϵ���
	//a='A'; //������
}
