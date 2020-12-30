package part01.sec01.exam01;

public class Ex05_05 {

	public static void main(String[] args) {
		int a = 200;

		if (a < 100) {
			System.out.println("100보다 작군요..");// 조건이 참일때 무조건 첫명령어

			System.out.println("참이면 이 문장도 보이겠죠?");
		}

		else // 위에 참말고 다른 거짓의 명령어가 있으면 안됨.(괄호로 묶어있는명령어 제외)
		{
			System.out.println("100보다 크군요..");
			System.out.println("거짓이면 이 문장도 보이겠죠?");
		}
		System.out.println("프로그램 끝!");

	}

}
