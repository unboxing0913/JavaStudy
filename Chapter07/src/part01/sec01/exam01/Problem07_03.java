package part01.sec01.exam01;

import java.util.Scanner;

public class Problem07_03 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
         
		String str;
		char ch;
		int i,k;
		int star;
		
		System.out.print("���ڸ� ���� �� �Է� : ");
		str=s.nextLine(); //���ڿ��Է�
		
		
		i=0;	
		ch = str.charAt(0);//0��°��ġ //ex)'1'(49) 2(50)3(51)4(52)5(53) 0(48) //()<== �ƽ�Ű�ڵ尪
		
		while(true) {
		    star=ch-48; // ����1��������ֱ����ؼ� 48���� star���������ֱ����ؼ� ����ch�ְ�
		         //�����̶� 4byte ó����
		    for(k=0;k<star;k++) {
		    	
		    	System.out.print("*");	
		    }
		        
		        
		     
		      i++;//�б��������������ָ��
		     if(i>str.length()-1) { // ���������� ����� ��ġ�� ���� ex) 10�� =>0~9 //�����ϱ�
		    	 break;
		     }ch = str.charAt(i);//���� (0) �� ����1�� ������ֱ����ؼ� �ذű⶧���� ������ų ��ɹ� �ѹ� �� �Է�
		     
		   System.out.println();
		   s.close();
		}
		
		
	}

}

//Scanner ���
// �ݺ���while(true)���
//for�� ��� , if�� ���,break ���
// ���ڿ��� ������ ����   String str
// �ԷµǴ� ���� ���ڿ��� ó���ǹǷ� ���ڷ� �ٲپ� �־�� �Ѵ�.
//��Ʈ => �ƽ�Ű�ڵ�ǥ������ ����1�� ���ڷ� �󸶿� ǥ�ð��ɰ� �ٲ۰��� star��� ������ ������ ���� //����1 ����49��