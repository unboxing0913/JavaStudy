package part01.sec01.exam01;

public class Ex05_06_01 {

	public static void main(String[] args) {
		int a=10,b=5;
        int i;
		
		if(a<b)
			i=a-b;
		else
			i=b-a;
		System.out.println("i="+i);
		
		
		// ���� ������      ����=(����)?(   ���϶�  : �����϶�    );
		i=a<b? a-b:b-a;
		System.out.println("i="+i);

	}

}
