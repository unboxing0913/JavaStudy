package part01.sec02.exam07;

class Accumulator{
	int total=0;
	static int grandTotal=0; //static 공용
	
	void accumulate(int amount) {
	   this.total+=amount;
	   grandTotal+=amount;
		
	}
	
}



public class StaticFieldExample1_1 {

	public static void main(String[] args) {
		Accumulator obj1=new Accumulator(); 
		Accumulator obj2=new Accumulator(); 
		
		obj1.accumulate(10);//10
		obj2.accumulate(20);//20 => + 되서 30
		
		System.out.println("obj1.total="+obj1.total);
		System.out.println("obj1.grandTotal="+obj1.grandTotal);
		
		System.out.println("obj2.total="+obj2.total);
		System.out.println("obj2.grandTotal="+obj2.grandTotal);
		
	}

}
