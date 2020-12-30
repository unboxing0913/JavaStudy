package part01.sec01.exam02;

class Member{
	public String id;
	public Member(String id) {
		this.id=id;
	}

	public boolean equals(Object obj) { //equals �������̵�
		if(!(obj instanceof Member)){
			return false;
		}
		
		Member member = (Member)obj;		//	

	  //if(id==member.id) {
	    if(id.equals(member.id)) {
	        return true;
		}else { 
			return false;
		}
	}
	
}

public class MemberExample_3 {

	public static void main(String[] args) {
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		if(obj1.equals(obj2)) { //���⼭�� equals�� ������Ʈequals�̱⶧���� ���ڿ��񱳸��������� ���ϰ����ϸ� �������̵��������
			System.out.println("obj1�� obj2�� �����մϴ�.");
		}else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
 
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		}else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}

}
