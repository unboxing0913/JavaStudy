package part01.sec01.exam01;

import java.util.LinkedList;

public class LinkedListExample_4 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>(); /*연결되는구조 (쌍방간에 ) */
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		
		int num=list.size();
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);
		}

	}

}
