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
		return num; /*return값 통일시키는목적*/
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
		         /*정수를 문자열로변환*/
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
		
		System.out.println("저장된 데이터의 수:"+hSet.size());
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
