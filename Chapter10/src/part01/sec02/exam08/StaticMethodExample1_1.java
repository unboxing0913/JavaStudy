package part01.sec02.exam08;

class Accumulator{
	int total=0;
	static int grandTotal=0; 
	
	void accumulate(int amount) {
	   this.total+=amount;
	   grandTotal+=amount;
		
	}
	
	static int getGrandTotal() { //static 메소드안에 인스턴스멤버는 못들어감 this도 포함
		return grandTotal;
	}
	
}

public class StaticMethodExample1_1 {

	public static void main(String[] args) {
		

		Accumulator obj1=new Accumulator(); 
		Accumulator obj2=new Accumulator(); 
		
		obj1.accumulate(10);
		obj2.accumulate(20);
		
		//int grandTotal=obj1.getGrandTotal();
		  int grandTotal=Accumulator.getGrandTotal();
		
		System.out.println("obj1.total="+obj1.total);
		System.out.println("obj2.total="+obj2.total);
		System.out.println("총계="+grandTotal);

	}

}
