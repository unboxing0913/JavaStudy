package chapter6.exam;

public class MemberService {

	public boolean login(String id, String password) {
		if(id == "hong" && password=="12345") {
		 return true;		 
	}else {
		return false;
	}		
}
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	
	
}
