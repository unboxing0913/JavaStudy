package part01.sec01.exam01;

public class Ex05_07 {

	public static void main(String[] args) {
		// int a=75;
		int a = 75;
		if (a > 50) {// if else 안에 또다른 if else가 들어올수있다.
			if (a < 100) { // 100보다 아래지정
				System.out.println("50보다 크고 100보다 작군요..");// 50~100지정
			} else { // 100보다 위에
				System.out.println("와~~100보다 크군요..");
			}
		} else {// 50보다아래
			System.out.println("에게~50보다 작군요..");
		}

	}
}