package part01.sec01.exam01;

public class Ex09_08 {

	public static void main(String[] args) {
		
		 String str1="Java Programming";
		 String str2="Java IT Language";
		 
		 System.out.println("�� ���ڿ�1==> ["+str1+"]"); 
		 System.out.println("�� ���ڿ�2==> ["+str2+"]");
		 
		 System.out.println(str1.compareTo(str2)); // str1�� str2�� Ʋ�� ���ۺκ��� �ƽ�Ű�ڵ尪  - ����� 7 (P=80,I=73)
		 System.out.println(str1.contains("Java"));//Java�� ����ֳ� true
	}

}
//�񱳴��.compareTo(�񱳴��):�ΰ��� String�� �տ������� ���������� ���ϴٰ� Ʋ���κ��� ������ 
//                         ���ϴ� String�� ĳ���Ͱ�( �ƽ�Ű�ڵ尪  - ����� 7 (P=80,I=73)�� ��ȯ�Ѵ�.
//�񱳴��.contains(���ڿ�):�ΰ��� String�� ���ؼ� �񱳴�� String�� �����ϰ� ������true, �ٸ��� false�� ��ȯ�Ѵ�.