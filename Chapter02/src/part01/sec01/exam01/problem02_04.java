package part01.sec01.exam01;

import java.util.Scanner;

public class problem02_04 {

	public static void main(String[] args) {
		
//		Scanner in=new Scanner(System.in);
//				\	
//		System.out.print("�̸��� �Է�:");
//		String name=in.next(); 
//	    
//		System.out.print("���������� �Է�:");	    
//	    int kor=in.nextInt();
//	    
//	    System.out.print("���������� �Է�:");
//	    int eng=in.nextInt();
//	    
//	    
//	    System.out.println(name+"���� ������"+(kor+eng)+"�� �Դϴ�.");
//	                    //����=kor+eng�̷����� ���� �����ϰ� ����ص��� (���߿� ��ձ��� ����Ҷ� ����)
//	                                             
//         in.close();
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("�̸��� �Է� : ");
		String name =s.next();
		System.out.print("���������� �Է� : ");
		int kor=s.nextInt();
		System.out.print("���������� �Է� : ");
		int elg=s.nextInt();
		
		int result=kor+elg;
		System.out.print(name+"���� ������"+result+"�� �Դϴ�.");
		
		s.close();
	}

}
