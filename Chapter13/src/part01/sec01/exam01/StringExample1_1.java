package part01.sec01.exam01;

public class StringExample1_1 {

	public static void main(String[] args) {
	String str="�ڹ� Ŀ��";
	int len=str.length();
	
	for(int cnt=0;cnt<len;cnt++) {
		char ch=str.charAt(cnt);
		    System.out.println(ch);
	}
	
	String str1="�ڹ�";
	String str2="�ڹ�";	
	if(str1==str2) {  //�������ڿ��̸� ��ü ���ξȸ��� ������ ���� 
		System.out.println("����");
	}else {
	    System.out.println("�ٸ�");
	}
	
	String str3=new String("�ڹ�");
	String str4=new String("�ڹ�");
	
	if(str3==str4) { //���θ�������⶧���� �ٸ� ������������������
		System.out.println("����");
	}else {
	    System.out.println("�ٸ�");
	}
	
	if(str3.equals(str4)) { // ���� ���ڿ� ������ ���� 
		System.out.println("����");
	}else {
	    System.out.println("�ٸ�");
	}

	}

}
