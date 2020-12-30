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
		this(name,id,password);//this():������ȣ��
		this.phoneNo=phoneNo;
		this.address=address;
//		this(name,id,password); // ��������ʱ�ȭ // this():�ٸ�������ȣ���� �ݵ�� �������� ù��
	}
	
	void changePassword(String password) {
		this.password=password;
	}
	
	void setPhoneNo(String phoneNo) { //�����Ҷ� set (����) �޼ҵ� �ҹ��ڽ���
		this.password=phoneNo;
	}
	void setAddress(String address) { //������ ���� �ܾ�빮��
		this.address=address;
	}
	
	
}

public class ConstExample2_04 {

	public static void main(String[] args) {
		SubscriberInfo obj1,obj2;
		obj1=new SubscriberInfo("�����","poorman","zebi");
		obj2=new SubscriberInfo("�����","richman","money","02-000-0000","Ÿ���Ӹ���");
		
		printSubscriberInfo(obj1); // �޼ҵ� �� SubscriberInfo obj �� �����Ѱ���  
		printSubscriberInfo(obj2);
		
		
		
		

	}
//main�� static�̱⶧���� ���� static�� �ٿ������ static => ��ü�����Ǳ������� �޼ҵ忡 ���ֽ�Ű�°�	
 //�Ѱ��ִ� �����־�� ���డ�� //�޼ҵ� ���๮�� ��ȯ�����־����
static void printSubscriberInfo(SubscriberInfo obj){ //SubscriberInfoŸ���� obj (�ٽú���)
		System.out.println("�̸�:"+obj.name);         //�޼ҵ�� ��ȯŸ��,�� (exŬ����Ÿ���� obj��)
		System.out.println("���̵�:"+obj.id);
		System.out.println("�н�����:"+obj.password);
		System.out.println("��ȭ��ȣ:"+obj.phoneNo);
		System.out.println("�ּ�:"+obj.address);
		System.out.println();
	}

}
