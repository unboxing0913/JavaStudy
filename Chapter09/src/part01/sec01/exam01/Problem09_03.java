package part01.sec01.exam01;
//�̰� �������ؾ��� (1)for���� ��Ծ����� ��� ,(2)lotto[k]�� ����  1000�� Ÿ����
public class Problem09_03 {
	//get ��������        //set �����ϴ�
	public static int getNumber() {
		return (int)(Math.random()*45)+1;	
	}

	public static void main(String[] args) {
		int[] lotto= {0,0,0,0,0,0};
		int i,k,num;
		char dup1='N';
		
		System.out.printf("**�ζ� ��÷�� �����մϴ�.**\n\n");
		i=0;//�̷��������	
		for(;i<6;) { //012345
			num=getNumber();				
			for(k=0;k<=i;k++) {
				if(lotto[k]==num)  //�������ڸ�Y (�ߺ��˻�)
					dup1='Y';					
			    }				
								
				/// for�������� �ߺ��˻�
			
			
				if(dup1=='N') {		//�ߺ�������			
					lotto[i++]=num;//for������ ���⼭���� �ߺ������� ����
				}else{ // �ߺ������� 
					dup1='N';
										
				  }
			}
			
		
		
		       System.out.printf("��÷�� �ζ� ��ȣ ==>");			
		       for(i=0;i<6;i++) {
			   System.out.printf("%d ",lotto[i]);
		       }
	
	}
}


