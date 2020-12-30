package part01.sec01.exam07;
//클래스생성단계에서 abstract체크하면 자동으로 만들어짐

public abstract class MessageSender { 
	
   String title;
   String senderName;
   
   MessageSender(String title,String senderName){
	   this.title=title;
	   this.senderName=senderName;	   
   }
   
   abstract void sendMessage(String recipient); //추상 메서드
   
   
   
}

/*
 * abstract 메서드가 정의되어 있는 클래스는 객체 생성이 불가능하기 때문에
 * 클래스 역시 abstract 클래스로 선언되어야 한다 따라서 객체 생성이 불가능 하다.
 * abstract 메서드가 없어도 객체 생성을 원하지 않으면 클래스를 abstract로 선언
 * 하면 된다. 그러나 abstract 메서드가 하나라도 존재하면 그 클래스는 반드시 추상 클래스(abstract)로 선언해야한다.
 * 
 */
