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
        hashtable.put("ȫ�浿",new ContactInfo("��� ���θ�","010-0000-0000"));
        hashtable.put("�����",new ContactInfo("����","010-2222-2222"));
        hashtable.put("�����",new ContactInfo("û�㵿","010-3333-3333"));
        
        ContactInfo obj = hashtable.get("�����");
        System.out.println("������� ����ó");
        System.out.println("�ּ� :"+obj.address);
        System.out.println("��ȭ��ȣ:"+obj.phoneNo);
        
        ContactInfo obj2 = hashtable.get("�����");
        System.out.println("������� ����ó");
        System.out.println("�ּ� :"+obj2.address);
        System.out.println("��ȭ��ȣ:"+obj2.phoneNo);
        
        ContactInfo obj3 = hashtable.get("ȫ�浿");
        System.out.println("ȫ�浿�� ����ó");
        System.out.println("�ּ� :"+obj3.address);
        System.out.println("��ȭ��ȣ:"+obj3.phoneNo);
	}

}
