package part01.sec01.exam01;

public class Ex08_05 {

	public static void main(String[] args) {
		int[] aa=new int[100];
		int bb[]=new int[100];
		int i;
		
		for(i=0;i<100;i++) { //i��º����� ������Ÿ���ų� ��ġ����Ÿ���¿뵵
			aa[i]=i*2; // aa[0]=0 , aa[1]=2,~,aa[99]=198
		}
		for(i=0;i<100;i++) {
			bb[i]=aa[99-i]; // �迭�ȿ��� ����� ����
			
			//1        98
					
		
		}
		
		   System.out.printf("bb[0]�� %d,bb[99]�� %d �Էµ�\n",bb[0],bb[99]);
		   // bb[0]==>198,bb[99]==>0
	}
}

