package part01.sec01.exam01;

import java.util.HashSet;
import java.util.Set;

public class SetExample_16 {

	public static void main(String[] args) {
		Object[] objArr= {"1",new Integer(1),"2","2","3","3","4","4","4"}; /*HashSet�� �ڷᱸ�� Ŭ������ �迭�� ���� �ϳ��ϳ� ����ִ��۾�*/
		Set<Object> set=new HashSet<Object>();
		
		for(int i=0;i<objArr.length;i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
		
		/*���ڿ�"1"�� ����Ÿ�� (1)�� �ٸ� , �������� �ߺ��Ǵ°� ����ȵ�*/
	}
}
/*
 * ������ �������� �ʴ´�.
 * �ߺ��Ǵ� ��ü�� �������� �ʴ´�.
 */
