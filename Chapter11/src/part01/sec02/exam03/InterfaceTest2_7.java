package part01.sec02.exam03;

class A3{
	void autoPlay(I i) { //Ib i=new B();
		i.play();
	}
}

interface I{
	public abstract void play();
}

class B implements I{
	
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I{
	
	public void play() {
		System.out.println("play in C class");
	}
}


public abstract class InterfaceTest2_7 {

	public static void main(String[] args) {	
	       	A3 a = new A3();
	       
	       	a.autoPlay(new B());
	       	a.autoPlay(new C());
		/*	I i = new B();
		    a.autoPlay(i);
		    I j = new C();
		    a.autoPlay(j);   */
	       	
		    

	}

}
