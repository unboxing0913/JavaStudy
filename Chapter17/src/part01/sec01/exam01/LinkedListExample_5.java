package part01.sec01.exam01;

import java.util.LinkedList;

public class LinkedListExample_5 {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>(); /*����Ǵ±��� (�ֹ氣�� ) */
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2,"Ű��");
		list.set(0,"������");
		list.remove(1);
		list.remove("Ű��"); /*����Ǵ±������ٸ��� ������������ �ٰ���*/
		
		int num=list.size();
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);
		}


	}

}
