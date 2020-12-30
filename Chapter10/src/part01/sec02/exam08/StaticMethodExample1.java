package part01.sec02.exam08;


class Accumulator{
	int total;
	static int grandTotal=0;
	
	void accumulate(int amount) {
		total+=amount;
		grandTotal +=amount;
	}
	int getGrandTotal() {
		return grandTotal;
	}
}

public class StaticMethodExample1 {

	public static void main(String[] args) {
		Accumulator obj1=new Accumulator();
		Accumulator obj2=new Accumulator();
		
		obj1.accumulate(10);
		obj2.accumulate(20);
		
		int grandTotal=obj1.getGrandTotal();
		
		System.out.println("obj1.total="+obj1.total);
		System.out.println("obj2.total="+obj2.total);
		System.out.println("ÃÑ°è="+grandTotal);
		

	}
}
