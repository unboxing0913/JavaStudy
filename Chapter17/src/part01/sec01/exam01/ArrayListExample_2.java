package part01.sec01.exam01;

import java.util.ArrayList;

public class ArrayListExample_2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2,"키위");/*인덱스번호에 키위를 넣어라 / 키위가 들어가면서 복숭아가밀려남*/
		list.set(0,"오렌지");/*set 은 기존의 데이터를 덮어씀*/
		list.remove(1);/*해당되는 인덱스 위치의 값을 삭제*/
		list.remove("키위"); /*데이터 값으로 지워도 가능함*/
		
		int num=list.size();
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);       /*list 구조는 중복을 허락한다*/
		}
		

	}

}
