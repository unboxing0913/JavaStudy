package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str,strRep,strSub,strAry[];
		
		System.out.print("���ڿ��� �Է��ϼ���:");
		str=s.nextLine();
		
		strRep=str.replace(" ","$");
		strSub=str.substring(3,8); // 3������ġ 8�� ���������ں����ϳ����Բ� ��µ� (0���ͽ���) // ���ڿ� start ��ġ���� end������ ���ڿ� �ڸ���
		strAry=str.split(" ");     
		
		System.out.println("�Է� ���ڿ� ��� == >"+str);
		System.out.println("�ٲ� ���ڿ�==>"+strRep);
		System.out.println("�Ϻ� ���ڿ�==>"+strSub);
	
	    for(int i=0;i<strAry.length;i++) {
	    	System.out.println("�и��� ���ڿ�"+i+"==>"+strAry[i]);
	    }
	
              s.close();		
		
	}

}

// replace �Լ��� �ڽ��� �ٲٰ���� ���ڷ� ���ڿ��� ġȯ�����ִ� ����� �մϴ� : ���ڿ� ġȯ�Լ� repalce(��������,�ٲܹ���)
// str.substring(���� �ε���, ���� �ε���) = str ���ڿ��� �����ε��� ���� ���� �ε��������� �ڸ���.
// split(���ڿ�) => ������ ()���ڷ� ���ڿ��� �������ִ� (�迭)


