package part01.sec01.exam07;
//�߻�޼ҵ带 �������ִ� �߻�Ŭ������ �������Ű�� �ڽ�Ŭ������ �߻�޼ҵ带 �������̵��������

public class EmailSender extends MessageSender {

	String senderAddr;
	String emailBody;
	
	EmailSender(String title, String senderName,String senderAddr,String emailBody) {
		
		super(title, senderName);
		this.senderAddr=senderAddr;
	    this.emailBody=emailBody;
	}
	
	void sendMessage(String recipient) { //�߻�޼ҵ� �������̵�
		System.out.println("----------------------");
		System.out.println("���� :"+title);
        System.out.println("�����»�� :"+senderName+" "+senderAddr);
        System.out.println("�޴� ��� :"+recipient);
        System.out.println("����:"+emailBody);
	}

	
}
