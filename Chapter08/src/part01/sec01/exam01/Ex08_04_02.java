package part01.sec01.exam01;
                              //��ǥ�ټ��� �޼ҵ� �ڡڡڡڡ�
public class Ex08_04_02 {
                       
	public static void main(String[] args) { // main()�޼ҵ�:JVM���� ȣ��
		int[] scores;
		scores =new int[]{83,90,87};
		
		int sum1=0;
		
		System.out.println("scores[0]:"+scores[0]);
		System.out.println("scores[1]:"+scores[1]);
		System.out.println("scores[2]:"+scores[2]);
		
		for(int i=0;i<=2;i++) {				
			sum1+=scores[i];			
		}System.out.println("����sum1 : "+sum1);	
		
		 
		
		   //�żҵ�� ȣ���ؾ� ���� �Ѵ�. ȣ���Ҷ��� �ݵ�� ��ȣ �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		  int sum2=add(new int[]{83,90,87}); //ȣ���ϱ��� �������� ȣ����add()�� �����ѱ�°� 
		        //260�̶�°��� �Ѿ��
		  System.out.println("����sum2 : "+sum2);
		  System.out.println();
		  	  
	
		  
		  
	} //main�� �����鼭 ���α׷��� ����
           //  int[] scores= new int[]{83,90,87};     
   public static int add(int[] scores) { //add()�żҵ�==>�޼ҵ�� �ݵ��()�� �����ؾ� �Ѵ�.�ڡڡڡڡڡڡڡڡڡڡڡ�
           	   int sum=0;
           	   for(int i=0;i<3;i++) {
           		   sum+=scores[i];
           	   }          	   
           	   
             	System.out.println("����sum : "+sum);//260�Ѿ
           	   //return:�޼ҵ� ����ڡڡڡڡڡڡڡڡڡڡڡ�
           	   return sum; //return���� ������������ �޼ҵ������̸鼭 sum���� ȣ���� ������ �����ش�.  
           	   //�����߿��� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
   }
	

}
