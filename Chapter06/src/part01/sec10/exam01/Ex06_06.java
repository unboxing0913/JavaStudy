package part01.sec10.exam01;

public class Ex06_06 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		
		for(i=1;i<=10;i++) {
			//1234568910
			hap=hap+i;//괄호안에서는 쭉더함 hap이 커지는중
			System.out.println(hap);
		}
		System.out.print(hap); // 괄호밖은 커진 hap 하나만출력 괄호가 끝난 지점에서
		//이미 hap은 55의 값을 저장하고있음.
		//System.out.printf("1에서10까지의 합%d\n",hap);
	}

}


