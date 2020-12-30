package part01.sec01.exam01;

import java.util.HashMap;

class ContactInfo{
	String address;
	String phoneNo;
	
	ContactInfo(String address,String phoneNo){
		this.address = address;
		this.phoneNo = phoneNo;
	}
}

public class Answer_11 {

	public static void main(String[] args) {
		HashMap<String,ContactInfo> hashtable=new HashMap<String,ContactInfo>();		
        hashtable.put("홍길동",new ContactInfo("산속 오두막","010-0000-0000"));
        hashtable.put("연흥부",new ContactInfo("강남","010-2222-2222"));
        hashtable.put("연놀부",new ContactInfo("청담동","010-3333-3333"));
        
        ContactInfo obj = hashtable.get("연놀부");
        System.out.println("연놀부의 연락처");
        System.out.println("주소 :"+obj.address);
        System.out.println("전화번호:"+obj.phoneNo);
        
        ContactInfo obj2 = hashtable.get("연흥부");
        System.out.println("연흥부의 연락처");
        System.out.println("주소 :"+obj2.address);
        System.out.println("전화번호:"+obj2.phoneNo);
        
        ContactInfo obj3 = hashtable.get("홍길동");
        System.out.println("홍길동의 연락처");
        System.out.println("주소 :"+obj3.address);
        System.out.println("전화번호:"+obj3.phoneNo);
	}

}
