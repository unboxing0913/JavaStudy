package part01.sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber{
	int num;
	public SimpleNumber(int n) {
		this.num=n;
	}
	
	@Override
	public int hashCode() {		
		return num; /*return�� ���Ͻ�Ű�¸���*/
	}
	
		
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SimpleNumber) {
			SimpleNumber n=(SimpleNumber)obj;
		   return this.num==n.num;
		   /*
		    * if(this.num==n.num){
		    * return true;
		    * }else{
		    * return false
		    * }
		    * 
		    */
		    }
	    return false;
		    }
		
	
	@Override
	public String toString() {
		         /*������ ���ڿ��κ�ȯ*/
		//return Integer.toString(this.num);
		//return ""+this.num;
		return String.valueOf(num);
	}
	
}

public class HashSetEqualityOne_20 {

	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(20));
		
		System.out.println("����� �������� ��:"+hSet.size());
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
