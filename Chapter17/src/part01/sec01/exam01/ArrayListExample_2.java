package part01.sec01.exam01;

import java.util.ArrayList;

public class ArrayListExample_2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2,"Ű��");/*�ε�����ȣ�� Ű���� �־�� / Ű���� ���鼭 �����ư��з���*/
		list.set(0,"������");/*set �� ������ �����͸� ���*/
		list.remove(1);/*�ش�Ǵ� �ε��� ��ġ�� ���� ����*/
		list.remove("Ű��"); /*������ ������ ������ ������*/
		
		int num=list.size();
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);       /*list ������ �ߺ��� ����Ѵ�*/
		}
		

	}

}
