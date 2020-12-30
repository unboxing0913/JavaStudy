package part01.sec01.exam07;
//추상메소드를 가지고있는 추상클래스는 상속을시키면 자식클래스는 추상메소드를 오버라이딩해줘야함

public class EmailSender extends MessageSender {

	String senderAddr;
	String emailBody;
	
	EmailSender(String title, String senderName,String senderAddr,String emailBody) {
		
		super(title, senderName);
		this.senderAddr=senderAddr;
	    this.emailBody=emailBody;
	}
	
	void sendMessage(String recipient) { //추상메소드 오버라이딩
		System.out.println("----------------------");
		System.out.println("제목 :"+title);
        System.out.println("보내는사람 :"+senderName+" "+senderAddr);
        System.out.println("받는 사람 :"+recipient);
        System.out.println("내용:"+emailBody);
	}

	
}
