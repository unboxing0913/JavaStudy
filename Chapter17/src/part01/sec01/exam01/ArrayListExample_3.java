package part01.sec01.exam01;

import java.util.ArrayList;

public class ArrayListExample_3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");

		int index1=list.indexOf("사과"); /*()안의값이 나오는 첫번째위치를 나타냄*/
		int index2=list.lastIndexOf("사과"); /*()안의값이 나오는 마지막위치를 나타냄*/
		
		System.out.println("첫번째 사과:"+index1);
		System.out.println("두번째 사과:"+index2);
	}

}
