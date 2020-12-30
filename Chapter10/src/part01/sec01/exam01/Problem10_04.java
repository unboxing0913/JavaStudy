package part01.sec01.exam01;

import java.util.Scanner;

class MyName{

	
	private String name;	

	
	MyName(String name){	
	this.name=name; 
		
}

	public String getName(){	
	return name;
}

}



public class Problem10_04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);		
		System.out.print("이름을 입력 : ");		
		String name = s.next();
		
		MyName ap=new MyName("홍길동");
		
		if(name.equals(ap.getName())) { // 문자열비교 equals , private 간접접근해야하기때문 getName호출
            System.out.println("입력하신 이름과 같습니다."); 
		}else
			System.out.println("입력하신 이름과 다릅니다.");
        s.close();
	}

	

}
