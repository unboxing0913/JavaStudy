package part01.sec10.exam01;


public class Ex06_14 {

	public static void main(String[] args) {
		//2*1=2 2*2=4 2*3=6 ........... 2*9=18
		//3*1=3 3*2=6 3*3=9 ........... 3*9=27
		//*1*2*3*4*5*6*7*8*9 �ݺ��ȴ�.
		int i,k;
	    
	         	 
		for(i=1;i<=9;i++) { //1������ 9������ 
			for(k=2;k<=9;k++) { // 2�ܺ��� 9�ܱ���
				System.out.printf("%d x %d= %d \t",k,i,k*i);
			}
			
			System.out.println();
			
		}
			
	}

}
