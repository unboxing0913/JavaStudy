package part01.sec01.exam05;

class AA{
	int i;
	private int j; // private�� ������ ��ӵ��� �ʴ´�.
	
	void setij(int x,int y) {
		this.i=x;
		this.j=y;
		
	}
}

class BB extends AA{
	int total;
	
	void sum() {
		//total=i+j;
	}
}
public class InheritanceTest2_5 {

	public static void main(String[] args) {
		BB subOb=new BB();
		subOb.sum();
		
	}

}
