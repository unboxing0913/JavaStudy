package part01.sec02.exam01;

public class PersonInformation_08 {

	private String name="gemini";
	private int age=10;
	private String socialNumber="991223-1234321";
	
	public static void main(String[] args) {
       
		PersonInformation_08 gemini= new PersonInformation_08();
		gemini.age=20;
	    gemini.printInformation(); //어디에 있는 메소드인지 gemini에 .(도트)접근해서 메소드
		

	}
	
	public void printInformation(){ //public => 패키지구분없이 어디서든 가져다 사용할수있다. //없을땐 같은패키지에서만 접근가능
          System.out.println(name+":"+age+":"+socialNumber);
	}

}
