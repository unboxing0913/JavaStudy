package part01.sec01.exam01;

import java.util.ArrayList;

public class ArrayListExample_3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("���");

		int index1=list.indexOf("���"); /*()���ǰ��� ������ ù��°��ġ�� ��Ÿ��*/
		int index2=list.lastIndexOf("���"); /*()���ǰ��� ������ ��������ġ�� ��Ÿ��*/
		
		System.out.println("ù��° ���:"+index1);
		System.out.println("�ι�° ���:"+index2);
	}

}
