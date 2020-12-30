package part01.sec02.exam01;

public class PersonInformation {
	
	private String name="gemini";
	private int age=10;
	private String socialNumber="991223-1234321";

	public void setAge(int age) {
		this.age=age;
	}
	
	public void printInformation(){
        System.out.println(name+":"+age+":"+socialNumber);
}
}
