package part01.sec01.exam01;
//indextOf() ��ó��()������ ��ġ
//lastIndexOf() ������������ ()������ ��ġ
public class Ex09_04 {

	public static void main(String[] args) {
		String str="Java�� �����ϴ� ��,Java�� JAVA��վ��.^^";
		
		System.out.println("���ڿ�==>"+str);
		
		System.out.print("���� ó�� ������ Java��ġ ==>");
		System.out.println(str.indexOf("Java"));
		System.out.print("�������� ������ Java��ġ ==>");
		System.out.println(str.lastIndexOf("Java"));
	}

}

//indextOf lastindextOf
//
//indexOf() �� Ư�� ���ڳ� ���ڿ��� �տ������� ó�� �߰ߵǴ� �ε����� ��ȯ�ϸ�
//���� ã�� ������ ��� "-1"�� ��ȯ�մϴ�.
//indexOf( "ã�� Ư�� ����" , "������ ��ġ" )
//"������ ��ġ" �������� ������ �����ϸ� ������ ��� 0��° �� ó������ ã�� �����Ѵ�.
//
//
//
//
//lastindexOf() �� Ư�� ���ڳ� ���ڿ��� �ڿ������� ó�� �߰ߵǴ� �ε����� ��ȯ�ϸ�
//���� ã�� ������ ��� "-1"�� ��ȯ�մϴ�.
//������ indexOf �� �����ϴ�

