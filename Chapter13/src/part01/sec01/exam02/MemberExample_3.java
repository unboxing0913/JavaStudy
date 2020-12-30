package part01.sec01.exam02;

class Member{
	public String id;
	public Member(String id) {
		this.id=id;
	}

	public boolean equals(Object obj) { //equals 오버라이딩
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
		
		if(obj1.equals(obj2)) { //여기서의 equals는 오브젝트equals이기때문에 문자열비교를하지않음 비교하고자하면 오버라이딩해줘야함
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
 
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		}else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}

}
