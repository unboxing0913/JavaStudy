package chapter6.exam;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong","12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout();
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
	}

}
