package part01.sec10.exam01;


public class problem06_02 {

	public static void main(String[] args) {
	     
	      int i;
	      for(i=0;i<=127;i++) {
	    	  if(i%16==0) { // �̷������� if �������������.
		    	  System.out.println("-----------------------");
		    	  System.out.println("10����\t16����\t����");
		    	  System.out.println("-----------------------");
		      }
	    	  
	      System.out.printf("%3d\t%3x\t%3c\n",i,i,i);
	     
	}     
 }
}
// �ݺ��� for if ���
// �ƽ�Ű �ڵ� ���(0���� 128����)
// 16���� ���� �������� 0�϶� �������