package part01.sec02.exam01;

class SubscriberInfo{
	String name,id,password;
	String phoneNo,address;
	
	SubscriberInfo(String name,String id,String password){
		this.name=name;
		this.id=id;
		this.password=password;
	}
	
	SubscriberInfo(String name,String id,String password,String phoneNo,String address){
//		this.name=name;
//		this.id=id;
//		this.password=password;
		this(name,id,password);//this():생성자호출
		this.phoneNo=phoneNo;
		this.address=address;
//		this(name,id,password); // 순서대로초기화 // this():다른생성자호출은 반드시 생성자의 첫줄
	}
	
	void changePassword(String password) {
		this.password=password;
	}
	
	void setPhoneNo(String phoneNo) { //저장할때 set (관례) 메소드 소문자시작
		this.password=phoneNo;
	}
	void setAddress(String address) { //다음에 오는 단어대문자
		this.address=address;
	}
	
	
}

public class ConstExample2_04 {

	public static void main(String[] args) {
		SubscriberInfo obj1,obj2;
		obj1=new SubscriberInfo("연흥부","poorman","zebi");
		obj2=new SubscriberInfo("연놀부","richman","money","02-000-0000","타워팰리스");
		
		printSubscriberInfo(obj1); // 메소드 값 SubscriberInfo obj 에 값을넘겨줌  
		printSubscriberInfo(obj2);
		
		
		
		

	}
//main이 static이기때문에 같은 static을 붙여줘야함 static => 객체생성되기이전에 메소드에 상주시키는것	
 //넘겨주는 값이있어야 실행가능 //메소드 실행문은 반환값이있어야함
static void printSubscriberInfo(SubscriberInfo obj){ //SubscriberInfo타입의 obj (다시보기)
		System.out.println("이름:"+obj.name);         //메소드는 반환타입,값 (ex클래스타입의 obj값)
		System.out.println("아이디:"+obj.id);
		System.out.println("패스워드:"+obj.password);
		System.out.println("전화번호:"+obj.phoneNo);
		System.out.println("주소:"+obj.address);
		System.out.println();
	}

}
