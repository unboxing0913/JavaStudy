package part01.sec01.exam01;

import java.util.LinkedList;

public class LinkedListExample_5 {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>(); /*연결되는구조 (쌍방간에 ) */
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2,"키위");
		list.set(0,"오렌지");
		list.remove(1);
		list.remove("키위"); /*저장되는구조만다르고 나머지사용법은 다같다*/
		
		int num=list.size();
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);
		}


	}

}
