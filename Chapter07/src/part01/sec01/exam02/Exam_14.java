package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		//1���� 100������ ���� �ϳ� �����Ѵ�
		// ��ǻ�Ͱ� ���� ���� ���ڸ� ���߸� ?������ ���߼̽��ϴ�. ���
        Scanner s=new Scanner(System.in);
        int comsu=(int)(Math.random()*100)+1; //1~100
        int i=0;//0�ְ� �տ��ٰ� i++�̸����������ָ�
        while(true) {
        	System.out.print("��ǻ�� ��: ");
        	int su=s.nextInt();
        	i++;//i����� �״�����ɹ��� ����ɶ� i�������ؼ� ���ʿ� ���ֱ�
        	if(su==comsu) {
        		break;
        	}else if(su < comsu) {
        			System.out.println("up�Դϴ�.");
        	}else {
        		System.out.println("down�Դϴ�.");
        		}
        	
        	//i++;
        	
        	}
        
              System.out.println(i+"������ ���߼̽��ϴ�.");
              s.close();
        }
	}


