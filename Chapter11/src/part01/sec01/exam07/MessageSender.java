package part01.sec01.exam07;
//Ŭ���������ܰ迡�� abstractüũ�ϸ� �ڵ����� �������

public abstract class MessageSender { 
	
   String title;
   String senderName;
   
   MessageSender(String title,String senderName){
	   this.title=title;
	   this.senderName=senderName;	   
   }
   
   abstract void sendMessage(String recipient); //�߻� �޼���
   
   
   
}

/*
 * abstract �޼��尡 ���ǵǾ� �ִ� Ŭ������ ��ü ������ �Ұ����ϱ� ������
 * Ŭ���� ���� abstract Ŭ������ ����Ǿ�� �Ѵ� ���� ��ü ������ �Ұ��� �ϴ�.
 * abstract �޼��尡 ��� ��ü ������ ������ ������ Ŭ������ abstract�� ����
 * �ϸ� �ȴ�. �׷��� abstract �޼��尡 �ϳ��� �����ϸ� �� Ŭ������ �ݵ�� �߻� Ŭ����(abstract)�� �����ؾ��Ѵ�.
 * 
 */
