package part01.sec01.exam01;

import java.util.LinkedList;

public class LinkedListExample_4 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>(); /*����Ǵ±��� (�ֹ氣�� ) */
		list.add("����");
		list.add("����");
		list.add("������");
		
		int num=list.size();
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);
		}

	}

}
