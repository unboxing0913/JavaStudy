package part01.sec01.exam01;

import java.util.ArrayList;

public class ArrayListExample_1 {

	public static void main(String[] args) {
		/*ArrayList*/
		ArrayList<String> list = new ArrayList<String>();
        list.add("����"); /*�����Ҷ� .add(�����Ұ�)*/
        list.add("����");
        list.add("������");
        
        int num=list.size(); /*.size() ũ��*/
        
        for(int cnt=0;cnt<num;cnt++) {
        	String str=list.get(cnt);/*�����ö� .get(�����ð�)*/
        	System.out.println(str);
        }
	}

}
