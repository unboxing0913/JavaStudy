package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_21 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int com[]=new int[6];
		int select[]=new int[6];
		

		for(int i=0;i<com.length;i++) {//�ݺ��ص� ���⼭ �ٽ� ++���ֱ⶧��
			com[i]=(int)(Math.random()*45)+1;
				for(int j=0;j<i;j++) { // j<i => i�� �� ������ ���ϸ�Ǳ⶧����
					if(com[i]==com[j]) {
						i--; //�ߺ��ȼ��ڿ����� ó�������ʱ����� i�� ��ġ�� ��
						break;//���� for���� ��������
					}		
				}		
             }
		for(int i=0;i<select.length;i++) {                   //�ԷµȰ� ����üũ
			do {
				System.out.print((i+1)+"��° ���� �Է�:");
				select[i]=s.nextInt();
			}while(select[i]>45 || select[i]<1); //���ǽ��� �����ϸ� �ٽ��о�� 
			
			for(int j=0;j<i;j++) {                           // �ԷµȰ� ����üũ
				if(select[i]==select[j]) {
					i--;
					break;
				}
			}
		}
		   int co=0;
		   for(int i=0;i<com.length;i++) {
			   for(int j=0;j<select.length;j++) {
				   if(com[i]==select[j]) {
					   co++;
					   break;
				   }
				  
				   
			   }
		   }
		      System.out.println(co+"���� ���߼̽��ϴ�");
		      s.close();
		

}
}

//for(int i=0;i<com.length;i++) {
//	com[i]=(int)(Math.random()*45)+1;
//		for(int j=0;j<com.length;j++) {
//			if(com[i]==com[j]) {
//				continue;
//			}else if(com[i]>com[j]) {
//				com[i]=com[j];
//			}else {
//				break;
//			}
//		        for(int k=0;k<select.length;k++) {
//				System.out.printf("%d��° ���� �Է� : ",k+1);
//				select[k] =s.nextInt();	
//				if(select[k]==com[j]) {
//				  	su+=1;
//				    }
//	             }					                          					    		
//              }
//            }
//      System.out.println(su+"�� ���߼̽��ϴ�.");
