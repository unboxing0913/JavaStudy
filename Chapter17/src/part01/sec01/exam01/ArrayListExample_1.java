package part01.sec01.exam01;

import java.util.ArrayList;

public class ArrayListExample_1 {

	public static void main(String[] args) {
		/*ArrayList*/
		ArrayList<String> list = new ArrayList<String>();
        list.add("포도"); /*저장할땐 .add(저장할값)*/
        list.add("딸기");
        list.add("복숭아");
        
        int num=list.size(); /*.size() 크기*/
        
        for(int cnt=0;cnt<num;cnt++) {
        	String str=list.get(cnt);/*가져올땐 .get(가져올값)*/
        	System.out.println(str);
        }
	}

}
