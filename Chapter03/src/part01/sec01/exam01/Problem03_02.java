package part01.sec01.exam01;

import java.util.Scanner;

public class Problem03_02 {

	public static void main(String[] args) {
		//Ŭ������ ���
		
	   Scanner s=new Scanner(System.in);
	   int type,data=0;//0���ִ����� -> 1,2,3 ���þ������� �ʱ�ȭ0
	   
	   String str; // ���ڿ� �ޱ� ���ؼ�4
	   
	   System.out.printf("�Է����� ����<1>10 <2>16 <3>8 :"); //����
	   type=s.nextInt(); // 1,2,3 �� ������
	   
	   System.out.printf("�� �Է�:");//����
	  
	   if(type == 1) {
		   str=s.next(); // ������ ������ �Է� 1 0(���ڿ�) // (nextInt�� ������������) 
	       data=Integer.parseInt(str, 10);//���� 10�����ιٲ��ְڴ�
	             //IntegerŬ������ ����� parseInt(��,����) �� �ٲ��ִ±��
	      
		    }   
     
	   if(type == 2) {
    	   str=s.next(); 
    	   data=Integer.parseInt(str, 16);//����16�����ιٲ��ְٴ�
    	   
       }
            
     
	   if(type == 3) {
    	   str=s.next(); 
    	   data=Integer.parseInt(str, 8);//����8�����ιٲ��ְڴ�.
            }
       
       
	    System.out.printf("10���� ==> %d\n",data);
		System.out.printf("16���� ==>%X\n",data); 
		System.out.printf("8���� ==> %o\n",data);
	
       
      s.close();
		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.print("�Է����� ����<1>10 <2>16 <3>8 :");
//		int result,data = 0;//
//		result = s.nextInt();
//		String str;//
//		System.out.print("�� �Է�: ");
//				
//		if (result == 1) {
//			str=s.next();//
//			data = Integer.parseInt(str,10);
//			}else if(result ==2) {
//				str=s.next();//
//				data = Integer.parseInt(str,16);
//			}else if(result ==3) {
//				str=s.next();//
//				data = Integer.parseInt(str,8);
//			}
//		  s.close();
//			
//		System.out.printf("10���� ==> %d\n",data);//
//		System.out.printf("16���� ==> %x\n",data);//
//		System.out.printf("24���� ==> %o\n",data);//
	
				
}
}