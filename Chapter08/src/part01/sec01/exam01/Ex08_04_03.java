package part01.sec01.exam01;

public class Ex08_04_03 {

	public static void main(String[] args) {
		 int[] arr1=new int[3]; // ��ƮŸ���� �迭�� �޸𸮿� �����
		 for(int i=0;i<3;i++) { //��ƮŸ�� �迭�� ���ΰ������൵ ����Ʈ������0�̵� 
			 
			 System.out.println("arr1["+i+"]:"+arr1[i]);
		
		 }
		 arr1[0]=10;
		 arr1[1]=20;
		 arr1[2]=30;
		 
             for(int i=0;i<3;i++) {
			 
			   System.out.println("arr1["+i+"]:"+arr1[i]);
	}
       ///////////////////////////////////////////////////////////////////      
             
             double[] arr2=new double[3]; 
    		 for(int i=0;i<3;i++) { //����Ÿ���� �������ָ� 0.0�̵�  			 
    			 System.out.println("arr2["+i+"]:"+arr2[i]);
    		 }
    		 
    		 arr2[0]=0.1;
    		 arr2[1]=0.2;
    		 arr2[2]=0.3;
    		 
                 for(int i=0;i<3;i++) {
    			 
    			   System.out.println("arr2["+i+"]:"+arr2[i]);

                }
       /////////////////////////////////////////////////////////////////////
                 String[] arr3=new String[3]; 
        		 for(int i=0;i<3;i++) { //���ڿ�Ÿ���� �������ָ� null�̵�  	//null:����Ű�´���̾���.		 
        			 System.out.println("arr3["+i+"]:"+arr3[i]);
        		 }
        		 
        		 arr3[0]="1��";
        		 arr3[1]="2��";
        		 arr3[2]="3��";
        		 
                     for(int i=0;i<3;i++) {
        			 
        			   System.out.println("arr3["+i+"]:"+arr3[i]);

                    }
        //////////////////////////////////////////////////////////////////////
                     char[] arr4=new char[3]; 
            		 for(int i=0;i<3;i++) { //ĳ����Ÿ���� �������ָ� �����̵�  			 
            			 System.out.println("arr4["+i+"]:"+arr4[i]);
            		 }
            		 
            		 arr4[0]='��';
            		 arr4[1]='��';
            		 arr4[2]='��';
            		 
                         for(int i=0;i<3;i++) {
            			 
            			   System.out.println("arr4["+i+"]:"+arr4[i]);

                        }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
	}               
}