package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		
        System.out.print("���ڿ� �Է�==>");
        str=s.nextLine();
        System.out.print("��� ���ڿ�==>");
        
        // ���ڿ��� ó�� �Ǵ� ���� Ư�� ���ڿ����� Ȯ���ϴ� startswith(),endswith()
        if(!str.startsWith("(")) { //���۵Ǵ�ù��° ���ڿ��� "(" �� �ƴϸ�
            System.out.printf("(");
        } 
        
        for(int i=0;i<str.length();i++) {
        	System.out.printf("%c",str.charAt(i));
        }
        	if(!str.endsWith(")")){        		
        		 System.out.printf(")");
        	} s.close();
        }  
           
	}

//string �� startsWith(),endsWith() �޼ҵ��� ����
//
//boolean Ÿ������ ����
//
//startsWith(String)��
// String Ÿ���� ���ڷ� ������, 
//�ش� String ��ü�� ���ڷ� ���޵� String���� �����Ѵٸ�
// true�� �����ϰ� �׷��� �ʴٸ� false�� �����մϴ�
//
//endsWith(String)
//endsWith(String)�� String Ÿ���� ���ڷ� ������, 
//�ش� String ��ü�� ���ڷ� ���޵� String���� �����ٸ�
// true�� �����ϰ� �׷��� �ʴٸ� false�� �����մϴ�.
