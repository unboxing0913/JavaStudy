package part01.sec01.exam01;

import java.util.Scanner;

public class ms_03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		char ch;
		int star;
		int i=0;
		
		System.out.print("���ڸ� ������ �Է� : ");//ex)4��
		String str=s.nextLine();
		ch=str.charAt(0);
		
		while(true) {
			star=ch-48; //����1�ǰ� �� 49�� ���� 1�ǰ���������ַ���
									
	     	
		 for(int k=0;k<star;k++) {//0->1�ɶ����� 1���ݺ� i���������ϸ鼭 �����ݺ�
			 System.out.print("*");			 
		 }
		   i++;//����if���� ���� �÷����ϱ⶧���� �Է��Ѽ��ڰ� ���� �Ѿ�� break ������ؼ�
		
		 if(i>str.length()-1) {//length()=>4-1=3   ex)0,1,2,3 =>4��
			 break;
			 
		 }  
		   
		    ch=str.charAt(i); //ch���� �����ϰ� �ϱ����� �ڵ�
				
								
          System.out.println();
		}

	}
}

////////////////////////////////////////////////////
//String str;
//char ch;
//int i,k;
//int star;
//
//System.out.print("���ڸ� ���� �� �Է� : ");
//str=s.nextLine(); //���ڿ��Է�
//
//
//i=0;	
//ch = str.charAt(0);//0��°��ġ //ex)'1'(49) 2(50)3(51)4(52)5(53) 0(48) //()<== �ƽ�Ű�ڵ尪
//
//while(true) {
//    star=ch-48; // ����1��������ֱ����ؼ� 48���� star���������ֱ����ؼ� ����ch�ְ�
//         //�����̶� 4byte ó����
//    for(k=0;k<star;k++) {
//    	
//    	System.out.print("*");	
//    }
//        
//        
//     
//      i++;//�б��������������ָ��
//     if(i>str.length()-1) { // ���������� ����� ��ġ�� ���� ex) 10�� =>0~9 //�����ϱ�
//    	 break;
//     }ch = str.charAt(i);//���� (0) �� ����1�� ������ֱ����ؼ� �ذű⶧���� ������ų ��ɹ� �ѹ� �� �Է�
//     
//   System.out.println();
//   s.close();
